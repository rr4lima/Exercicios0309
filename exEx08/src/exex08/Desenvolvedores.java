package exex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desenvolvedores {
    private String nome;
    private String especialidade;
    private List<Desenvolvedores> desenvolvedores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcDesenvolvedor() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo desenvolvedor? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do desenvolvedor: ");
                String nomeDev = scanner.nextLine();

                System.out.print("Digite a especialidade do desenvolvedor: ");
                String espDev = scanner.nextLine();

                desenvolvedores.add(new Desenvolvedores(nomeDev, espDev));
                System.out.println("Desenvolvedor cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de desenvolvedores encerrado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarDesenvolvedores() {
        if (desenvolvedores.isEmpty()) {
            System.out.println("Nenhum desenvolvedor cadastrado.");
        } else {
            System.out.println("Desenvolvedores cadastrados:");
            for (Desenvolvedores d : desenvolvedores) {
                System.out.println("Nome: " + d.getNome() + " | Especialidade: " + d.getEspecialidade());
            }
        }
    }

    public Desenvolvedores() {}

    public Desenvolvedores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public List<Desenvolvedores> getDesenvolvedores() { return desenvolvedores; }

    @Override
    public String toString() {
        return "Desenvolvedores{" + "nome=" + nome + ", especialidade=" + especialidade + ", desenvolvedores=" + desenvolvedores + ", scanner=" + scanner + '}';
    }
    
}
