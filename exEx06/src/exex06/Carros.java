package exex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carros {

    private String modelo;
    private double preco;
    private Marcas marca;
    private Vendedores vendedor;
    private boolean vendido;

    private List<Carros> carros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcCarro(List<Marcas> marcas, List<Vendedores> vendedores) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo carro? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o modelo do carro: ");
                String modeloCarro = scanner.nextLine();

                System.out.print("Digite o preço do carro: ");
                double precoCarro = Double.parseDouble(scanner.nextLine());


                if (marcas.isEmpty()) {
                    System.out.println("Nenhuma marca cadastrada. ");
                    return;
                }
                System.out.println("Escolha a marca:");
                for (int i = 0; i < marcas.size(); i++) {
                    System.out.println((i + 1) + " - " + marcas.get(i).getNome());
                }
                int escolhaMarca = Integer.parseInt(scanner.nextLine()) - 1;
                Marcas marcaSelecionada = marcas.get(escolhaMarca);

   
                if (vendedores.isEmpty()) {
                    System.out.println("Nenhum vendedor cadastrado.");
                    return;
                }
                System.out.println("Escolha o vendedor:");
                for (int i = 0; i < vendedores.size(); i++) {
                    System.out.println((i + 1) + " - " + vendedores.get(i).getNome());
                }
                int escolhaVend = Integer.parseInt(scanner.nextLine()) - 1;
                Vendedores vendedorSelecionado = vendedores.get(escolhaVend);

                carros.add(new Carros(modeloCarro, precoCarro, marcaSelecionada, vendedorSelecionado, false));
                System.out.println("Carro cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de carros encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            System.out.println("Carros cadastrados:");
            for (Carros c : carros) {
                System.out.println("Modelo: " + c.getModelo() +
                                   " | Preço: " + c.getPreco() +
                                   " | Marca: " + c.getMarca().getNome() +
                                   " | Vendedor: " + c.getVendedor().getNome() +
                                   " | Vendido: " + (c.isVendido() ? "Sim" : "Não"));
            }
        }
    }

    public void calcularMediaPorMarca(String nomeMarca) {
        double soma = 0;
        int count = 0;

        for (Carros c : carros) {
            if (c.getMarca().getNome().equalsIgnoreCase(nomeMarca)) {
                soma += c.getPreco();
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Média de preços da marca " + nomeMarca + ": " + (soma / count));
        } else {
            System.out.println("Nenhum carro encontrado para essa marca.");
        }
    }

    public void exibirCarrosVendidos(String nomeVendedor) {
        boolean achou = false;
        for (Carros c : carros) {
            if (c.getVendedor().getNome().equalsIgnoreCase(nomeVendedor) && c.isVendido()) {
                System.out.println("Modelo: " + c.getModelo() + " | Preço: " + c.getPreco());
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum carro vendido por este vendedor.");
        }
    }

    public Carros() {}

    public Carros(String modelo, double preco, Marcas marca, Vendedores vendedor, boolean vendido) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.vendedor = vendedor;
        this.vendido = vendido;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public Marcas getMarca() {
        return marca;
    }

    public Vendedores getVendedor() {
        return vendedor;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public List<Carros> getCarros() {
        return carros;
    }

    @Override
    public String toString() {
        return "Carros{" + "modelo=" + modelo + ", preco=" + preco + ", marca=" + marca + ", vendedor=" + vendedor + ", vendido=" + vendido + ", carros=" + carros + ", scanner=" + scanner + '}';
    }
    
    
}

