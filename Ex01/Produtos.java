package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produtos {

    private String nome;
    private int quantidade;
    Scanner scanner = new Scanner(System.in);

    protected List<Produtos> estoque = new ArrayList<>();

    public Produtos() {
    }

    public Produtos(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adcProd() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um novo produto? 1 Para sim e 2 Para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do produto: ");
                nome = scanner.nextLine();

                System.out.println("Digite a quantidade que deseja cadastrar: ");
                quantidade = scanner.nextInt();
                scanner.nextLine();

                estoque.add(new Produtos(nome, quantidade));
                System.out.println("Produto cadastrado com sucesso!");

            } else if (resposta.equals("2")) {
                System.out.println("Registro cancelado");
                continuar = false;

            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarProd() {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("Estoque da Loja: ");
        for (Produtos p : estoque) {
            System.out.println("Produto: " + p.getNome() + " | Quantidade: " + p.getQuantidade());
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Quantidade: " + quantidade;
    }
}
