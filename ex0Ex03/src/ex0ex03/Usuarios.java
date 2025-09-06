package ex0ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {

    private String nomeUsu;
    private List<String> usuario = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcUsu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um novo usuário? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite seu nome de usuário: ");
                String nome = scanner.nextLine();

                this.nomeUsu = nome;
                System.out.println("Registro feito com sucesso!");
                usuario.add(nome);
            } else if (resposta.equals("2")) {
                System.out.println("Registro cancelado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
    
    public void listarUsu() {
        if (usuario.isEmpty()) {
            System.out.println("Nenhum usuário foi registrado.");
        } else {
            System.out.println("Usuários registrados: " + String.join(", ", usuario));
        }
    }

    public Usuarios() {
    }

    public Usuarios(String nome, String email) {
        this.nomeUsu = nome;
    }

    public String getNome() {
        return nomeUsu;
    }

    public void setNome(String nome) {
        this.nomeUsu = nome;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public List<String> getPublicacoes() {
        return usuario;
    }

    public void setPublicacoes(List<String> publicacoes) {
        this.usuario = publicacoes;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nomeUsu=" + nomeUsu  + ",usuario=" + usuario + ", scanner=" + scanner + '}';
    }
    
    

}


