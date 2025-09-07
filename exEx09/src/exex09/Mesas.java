package exex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesas {
    private int numero;
    private int capacidade;
    private List<Mesas> mesas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcMesa() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Deseja cadastrar uma nova mesa? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o número da mesa: ");
                int numMesa = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite a capacidade da mesa: ");
                int capMesa = Integer.parseInt(scanner.nextLine());

                mesas.add(new Mesas(numMesa, capMesa));
                System.out.println("Mesa cadastrada com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de mesas encerrado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarMesas() {
        if (mesas.isEmpty()) {
            System.out.println("Nenhuma mesa cadastrada.");
        } else {
            System.out.println("Mesas cadastradas:");
            for (Mesas m : mesas) {
                System.out.println("Número: " + m.getNumero() + " | Capacidade: " + m.getCapacidade());
            }
        }
    }

    public Mesas() {}
    public Mesas(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() { return numero; }
    public int getCapacidade() { return capacidade; }
    public List<Mesas> getMesas() { return mesas; }

    @Override
    public String toString() {
        return "Mesas{" + "numero=" + numero + ", capacidade=" + capacidade + ", mesas=" + mesas + ", scanner=" + scanner + '}';
    }
    
    
}
