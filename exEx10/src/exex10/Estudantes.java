package exex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudantes {
    private String nome;
    private int matricula;
    private List<String> disciplinas = new ArrayList<>();
    private List<Estudantes> estudantes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcEstudante() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo estudante? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do estudante: ");
                String nomeEst = scanner.nextLine();

                System.out.print("Digite a matrícula do estudante: ");
                int mat = Integer.parseInt(scanner.nextLine());

                estudantes.add(new Estudantes(nomeEst, mat));
                System.out.println("Estudante cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de estudantes encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
        } else {
            System.out.println("Estudantes cadastrados:");
            for (Estudantes e : estudantes) {
                System.out.println("Nome: " + e.getNome() + " | Matrícula: " + e.getMatricula());
            }
        }
    }

    public void matricularDisciplina() {
        System.out.print("Digite o nome do estudante para matricular em uma disciplina: ");
        String nomeEst = scanner.nextLine();
        Estudantes estSelecionado = null;
        for (Estudantes e : estudantes) {
            if (e.getNome().equalsIgnoreCase(nomeEst)) {
                estSelecionado = e;
                break;
            }
        }
        if (estSelecionado == null) {
            System.out.println("Estudante não encontrado.");
            return;
        }

        System.out.print("Digite o nome da disciplina: ");
        String disc = scanner.nextLine();
        estSelecionado.getDisciplinas().add(disc);
        System.out.println("Disciplina matriculada com sucesso!");
    }

    public Estudantes() {}
    public Estudantes(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() { return nome; }
    public int getMatricula() { return matricula; }
    public List<String> getDisciplinas() { return disciplinas; }
    public List<Estudantes> getEstudantes() { return estudantes; }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }
}
