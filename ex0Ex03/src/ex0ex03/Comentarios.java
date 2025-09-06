package ex0ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comentarios {

    String comentario;
    private String nomeUsu;
    private String autor;
    private List<String> comentarios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcComent() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um comentário à publicação de " + autor + "? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite seu comentário: ");
                String comentario = scanner.nextLine();

                System.out.println("Comentário publicado com suucesso!");
                comentarios.add(comentario);
            } else if (resposta.equals("2")) {
                System.out.println("Comentário cancelado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida");
            }

        }
    }

    public void listarComent() {
        if (comentarios.isEmpty()) {
            System.out.println("Nenhum comentário foi feito.");
        } else {
            System.out.println("Comentários feitos: " + String.join(", ", comentario));
        }
    }

    public Comentarios() {
    }

    public Comentarios(String comentario, String autor) {
        this.comentario = comentario;
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
