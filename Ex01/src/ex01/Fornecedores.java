package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fornecedores {

    private String nome;
    private List<Produtos> prodDisponiveis;
    Scanner scanner = new Scanner(System.in);

    public Fornecedores(String nome) {
        this.nome = nome;
        this.prodDisponiveis = new ArrayList<>();
    }

    public void adcProdFornc() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja cadastrar um produto no fornecedor " + nome + "? 1 Para sim e 2 Para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do produto: ");
                String nomeProd = scanner.nextLine();

                System.out.println("Digite a quantidade disponível: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                prodDisponiveis.add(new Produtos(nomeProd, quantidade));
                System.out.println("Produto adicionado ao fornecedor " + nome + ".");

            } else if (resposta.equals("2")) {
                System.out.println("Cadastro finalizado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public boolean atender(String nomeProd, int quantidade) {
        for (Produtos p : prodDisponiveis) {
            if (p.getNome().equalsIgnoreCase(nomeProd) && p.getQuantidade() >= quantidade) {
                return true;
            }
        }
        return false;
    }

    public void listarProd() {
        if (prodDisponiveis.isEmpty()) {
            System.out.println("Nenhum produto disponível no fornecedor " + nome + ".");
            return;
        }
        System.out.println("Produtos disponíveis no fornecedor: " + nome);
        for (Produtos p : prodDisponiveis) {
            System.out.println("Produto: " + p.getNome() + " | Quantidade: " + p.getQuantidade());
        }
    }

    @Override
    public String toString() {
        return "Fornecedores{" + "nome=" + nome + ", prodDisponiveis=" + prodDisponiveis + ", scanner=" + scanner + '}';
    }
    
    
}
