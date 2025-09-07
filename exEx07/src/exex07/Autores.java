package exex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autores {
    private String nome;
    private List<Autores> autores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcAutor() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Deseja cadastrar um novo autor? 1 Para sim e 2 paras não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do autor: ");
                String nomeAutor = scanner.nextLine();
                autores.add(new Autores(nomeAutor));
                System.out.println("Autor cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarAutores() {
        if (autores.isEmpty()) {
            System.out.println("Nenhum autor cadastrado.");
        } else {
            System.out.println("Autores cadastrados:");
            for (Autores a : autores) {
                System.out.println("Nome: " + a.getNome());
            }
        }
    }

    public Autores() {}
    public Autores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public List<Autores> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        return "Autores{" + "nome=" + nome + '}';
    }
}
