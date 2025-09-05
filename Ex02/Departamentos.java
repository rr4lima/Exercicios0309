package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departamentos {

    private String nome;
    double mediaSalario;
    Scanner scanner = new Scanner(System.in);
    private List<Departamentos> depart = new ArrayList<>();

    public Departamentos() {
    }

    public Departamentos(String nome, double mediaSalario) {
        this.nome = nome;
        this.mediaSalario = mediaSalario;
    }

    public Departamentos(String nome) {
        this.nome = nome;
    }

    public void adcDepart() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja cadastrar um novo departamento? 1 Para sim e 2 Para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do departamento: ");
                String nome = scanner.nextLine();

                System.out.println("Digite o salário do seu departamento");
                Double salario = Double.parseDouble(scanner.nextLine());

                depart.add(new Departamentos(nome, salario));
                System.out.println("Departamento adicionado.");

            } else if (resposta.equals("2")) {
                System.out.println("Cadastro cancelado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
    public void calcularSalario() {
        if (depart.isEmpty()) {
            mediaSalario = 0;
        } else {
            double soma = 0;
            for (Departamentos d : depart) {
                soma += d.getMediaSalario();
            }
            mediaSalario = soma / depart.size();

        }

    }

    public void listarDepart() {
        if (depart.isEmpty()) {
            System.out.println("Nenhum departamento foi registrado.");
            return;

        }
        calcularSalario();
        System.out.println("Departamentos registrados: ");
        for (Departamentos p : depart) {
            System.out.println("Departamento: " + p.getNome() + " |  Salário: " + p.getMediaSalario());
        }
        System.out.println("Média salarial geral dos departamentos: " + mediaSalario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

    public void setMediaSalario(double mediaSalario) {
        this.mediaSalario = mediaSalario;
    }

}
