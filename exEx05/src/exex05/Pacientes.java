package exex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pacientes {

    private String nome;
    private int idade;
    private List<Pacientes> pacientes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcPaciente() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar um novo paciente? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do paciente: ");
                String nomePac = scanner.nextLine();

                System.out.print("Digite a idade do paciente: ");
                int idadePac = Integer.parseInt(scanner.nextLine());

                pacientes.add(new Pacientes(nomePac, idadePac));
                System.out.println("Paciente cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Pacientes cadastrados:");
            for (Pacientes p : pacientes) {
                System.out.println("Nome: " + p.getNome() + " | Idade: " + p.getIdade());
            }
        }
    }

    public Pacientes() {
    }

    public Pacientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "nome=" + nome + ", idade=" + idade + '}';
    }
}
