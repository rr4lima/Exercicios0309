package exex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medicos {

    private String nome;
    private String especialidade;
    private List<Medicos> medicos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcMedico() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo médico? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do médico: ");
                String nomeMed = scanner.nextLine();

                System.out.print("Digite a especialidade do médico: ");
                String espMed = scanner.nextLine();

                medicos.add(new Medicos(nomeMed, espMed));
                System.out.println("Médico cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
        } else {
            System.out.println("Médicos cadastrados:");
            for (Medicos m : medicos) {
                System.out.println("Nome: " + m.getNome() + " | Especialidade: " + m.getEspecialidade());
            }
        }
    }

    public Medicos() {
    }

    public Medicos(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Medicos> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medicos> medicos) {
        this.medicos = medicos;
    }

    @Override
    public String toString() {
        return "Medicos{" + "nome=" + nome + ", especialidade=" + especialidade + '}';
    }
}
