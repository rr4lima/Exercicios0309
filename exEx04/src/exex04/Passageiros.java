package exex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passageiros {

    private String nome;
    private int cpf;
    private List<String> passageiros = new ArrayList<>();
    private List<String> cpfs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcPass() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja registrar um novo passageiro? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do passageiro: ");
                String nomePass = scanner.nextLine();

                System.out.println("Digite o cpf do passageiro: ");
                String cpfPass = scanner.nextLine();
                
                System.out.println("Passageiro cadastrado com sucesso.");
                passageiros.add(nomePass);
                cpfs.add(cpfPass);             

            } else if (resposta.equals("2")) {
                System.out.println("Registro de passeiro cancelado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarPass() {
        if (passageiros.isEmpty()) {
            System.out.println("Nenhum passageiro foi registrado.");
        } else {
            System.out.println("Passageiros registrados: ");
            for (int i = 0; i < passageiros.size(); i++) {
                System.out.println("Nome: " + passageiros.get(i) + "\n"+ "CPF: " + cpfs.get(i));
            }
        }
    }

    public Passageiros() {
    }

    public Passageiros(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<String> passageiros) {
        this.passageiros = passageiros;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

}
