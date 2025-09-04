package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedidos {

    private List<Produtos> produtosPedidos;
    Scanner scanner = new Scanner(System.in);
    private Fornecedores fornecedor;

    public Pedidos(Fornecedores fornecedor) {
        produtosPedidos = new ArrayList<>();
        this.fornecedor = fornecedor;
    }

    public void pedirProd() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja pedir um produto? 1 Para sim e 2 Para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do produto: ");
                String nomeProd = scanner.nextLine();

                System.out.println("Digite a quantidade que deseja pedir: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                if (fornecedor.atender(nomeProd, quantidade)) {
                    produtosPedidos.add(new Produtos(nomeProd, quantidade));
                    System.out.println("Produto pedido com sucesso!");
                } else {
                    System.out.println("Produto indisponível para pedir.");
                }

            } else if (resposta.equals("2")) {
                System.out.println("Registro finalizado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarProd() {
        if (produtosPedidos.isEmpty()) {
            System.out.println("Nenhum produto foi pedido.");
            return;
        }
        System.out.println("Produtos pedidos: ");
        for (Produtos p : produtosPedidos) {
            System.out.println("Produto: " + p.getNome() + " | Quantidade: " + p.getQuantidade());
        }
    }
}
