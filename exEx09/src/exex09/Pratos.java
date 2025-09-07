package exex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pratos {

    private String nome;
    private double preco;
    private List<Pratos> pratos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcPrato() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Deseja cadastrar um novo prato? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do prato: ");
                String nomePrato = scanner.nextLine();

                System.out.print("Digite o preço do prato: ");
                double precoPrato = Double.parseDouble(scanner.nextLine());

                pratos.add(new Pratos(nomePrato, precoPrato));
                System.out.println("Prato cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de pratos encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarPratos() {
        if (pratos.isEmpty()) {
            System.out.println("Nenhum prato cadastrado.");
        } else {
            System.out.println("Pratos cadastrados:");
            for (Pratos p : pratos) {
                System.out.println("Nome: " + p.getNome() + " | Preço: R$ " + p.getPreco());
            }
        }
    }

    public Pratos() {
    }

    public Pratos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public List<Pratos> getPratos() {
        return pratos;
    }

    @Override
    public String toString() {
        return "Pratos{" + "nome=" + nome + ", preco=" + preco + ", pratos=" + pratos + '}';
    }

}
