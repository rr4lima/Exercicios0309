package exex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projetos {
    private String nome;
    private String descricao;
    private List<Projetos> projetos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcProjeto() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo projeto? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do projeto: ");
                String nomeProj = scanner.nextLine();

                System.out.print("Digite a descrição do projeto: ");
                String descProj = scanner.nextLine();

                projetos.add(new Projetos(nomeProj, descProj));
                System.out.println("Projeto cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de projetos encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarProjetos() {
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
        } else {
            System.out.println("Projetos cadastrados:");
            for (Projetos p : projetos) {
                System.out.println("Nome: " + p.getNome() + " | Descrição: " + p.getDescricao());
            }
        }
    }

    public Projetos() {}

    public Projetos(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<Projetos> getProjetos() { return projetos; }

    @Override
    public String toString() {
        return "Projetos{" + "nome=" + nome + ", descricao=" + descricao + ", projetos=" + projetos + ", scanner=" + scanner + '}';
    }
    
}
