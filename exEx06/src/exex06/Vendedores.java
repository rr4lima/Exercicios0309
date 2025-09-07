package exex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vendedores {

    private String nome;
    private List<Vendedores> vendedores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcVendedor() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo vendedor? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do vendedor: ");
                String nomeVend = scanner.nextLine();

                vendedores.add(new Vendedores(nomeVend));
                System.out.println("Vendedor cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de vendedores encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarVendedores() {
        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado.");
        } else {
            System.out.println("Vendedores cadastrados:");
            for (Vendedores v : vendedores) {
                System.out.println("Nome: " + v.getNome());
            }
        }
    }

    public Vendedores() {}

    public Vendedores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Vendedores> getVendedores() {
        return vendedores;
    }

    @Override
    public String toString() {
        return "Vendedores{" + "nome=" + nome + '}';
    }
}
