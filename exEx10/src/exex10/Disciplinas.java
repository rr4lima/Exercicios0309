package exex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disciplinas {
    private String nome;
    private Professores professor;
    private List<Disciplinas> disciplinas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void criarDisciplina(List<Professores> professores) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja criar uma nova disciplina? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome da disciplina: ");
                String nomeDisc = scanner.nextLine();

                System.out.print("Digite o nome do professor responsável: ");
                String nomeProf = scanner.nextLine();
                Professores profSelecionado = null;
                for (Professores p : professores) {
                    if (p.getNome().equalsIgnoreCase(nomeProf)) {
                        profSelecionado = p;
                        break;
                    }
                }
                if (profSelecionado == null) {
                    System.out.println("Professor não encontrado.");
                    continue;
                }

                disciplinas.add(new Disciplinas(nomeDisc, profSelecionado));
                System.out.println("Disciplina criada com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Criação de disciplinas encerrada.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            System.out.println("Disciplinas cadastradas:");
            for (Disciplinas d : disciplinas) {
                System.out.println("Nome: " + d.getNome() + " | Professor: " + d.getProfessor().getNome());
            }
        }
    }

    public Disciplinas() {}
    public Disciplinas(String nome, Professores professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() { return nome; }
    public Professores getProfessor() { return professor; }
    public List<Disciplinas> getDisciplinas() { return disciplinas; }

    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", professor=" + professor.getNome() + '}';
    }
}
