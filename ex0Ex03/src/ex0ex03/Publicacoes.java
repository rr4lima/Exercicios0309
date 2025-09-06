package ex0ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Publicacoes {

    private String nomeUsu;
    private List<String> publicacoes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void criarPublic() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar uma nova publicação ao usuário " + nomeUsu + "? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o conteúdo da publicação: ");
                String publ = scanner.nextLine();

                System.out.println("Publicação feita com sucesso!");
                publicacoes.add(publ);
            } else if (resposta.equals("2")) {
                System.out.println("Publicação cancelada.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarPublic() {
        if (publicacoes.isEmpty()) {
            System.out.println("Nenhuma publicação foi feita.");
        } else {
            System.out.println("Publicações feitas ao usuário " + nomeUsu+ ": " + String.join(", ", publicacoes));
        }
    }

    public Publicacoes() {
    }

    public Publicacoes(String nome, String email) {
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
        return publicacoes;
    }

    public void setPublicacoes(List<String> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nomeUsu=" + nomeUsu + ",publicacoes=" + publicacoes + ", scanner=" + scanner + '}';
    }

}
