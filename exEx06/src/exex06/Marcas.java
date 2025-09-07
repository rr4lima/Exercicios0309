package exex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marcas {

    private String nome;
    private List<Marcas> marcas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcMarca() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja cadastrar uma nova marca? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome da marca: ");
                String nomeMarca = scanner.nextLine();

                marcas.add(new Marcas(nomeMarca));
                System.out.println("Marca cadastrada com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de marcas encerrado.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarMarcas() {
        if (marcas.isEmpty()) {
            System.out.println("Nenhuma marca cadastrada.");
        } else {
            System.out.println("Marcas cadastradas:");
            for (Marcas m : marcas) {
                System.out.println("Marca: " + m.getNome());
            }
        }
    }

    public Marcas() {}

    public Marcas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Marcas> getMarcas() {
        return marcas;
    }

    @Override
    public String toString() {
        return "Marcas{" + "nome=" + nome + '}';
    }
}
