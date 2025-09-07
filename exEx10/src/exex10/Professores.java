package exex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professores {
    private String nome;
    private String departamento;
    private List<Professores> professores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcProfessor() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo professor? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do professor: ");
                String nomeProf = scanner.nextLine();

                System.out.print("Digite o departamento: ");
                String dept = scanner.nextLine();

                professores.add(new Professores(nomeProf, dept));
                System.out.println("Professor cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de professores encerrado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("Professores cadastrados:");
            for (Professores p : professores) {
                System.out.println("Nome: " + p.getNome() + " | Departamento: " + p.getDepartamento());
            }
        }
    }

    public Professores() {}
    public Professores(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() { return nome; }
    public String getDepartamento() { return departamento; }
    public List<Professores> getProfessores() { return professores; }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", departamento=" + departamento + '}';
    }
}
