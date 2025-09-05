package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {

    private String nomeFunc;
    private String projetos;
    protected String exibirProj;
    private List<String> funcionarios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Funcionarios() {
    }

    public Funcionarios(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void adcFunc() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um novo funcionario para? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do funcionário: ");
                String nomeProj = scanner.nextLine();

                System.out.println("Funcionário adicionado com sucesso.");
               funcionarios.add(nomeProj);

            } else if (resposta.equals("2")) {
                System.out.println("Adição de funcionário cancelada.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }

        }
    }

    public void listarFunc() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário foi registrado.");
        } else {
            System.out.println("Funcionários registrados: " + String.join(", ", funcionarios));
        }
    }

    public Funcionarios(String nomeFunc, String projetos, String exibirProj) {
        this.nomeFunc = nomeFunc;
        this.projetos = projetos;
        this.exibirProj = exibirProj;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getProjetos() {
        return projetos;
    }

    public void setProjetos(String projetos) {
        this.projetos = projetos;
    }

    public String getExibirProj() {
        return exibirProj;
    }

    public void setExibirProj(String exibirProj) {
        this.exibirProj = exibirProj;
    }

}
