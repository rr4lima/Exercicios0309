package exex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedidos {

    private Mesas mesa;
    private List<Pratos> pratosPedido;
    private double total;
    private List<Pedidos> pedidos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void criarPedido(List<Mesas> mesas, List<Pratos> pratos) {
        if (mesas.isEmpty() || pratos.isEmpty()) {
            System.out.println("Cadastre mesas e pratos antes de criar pedidos.");
            return;
        }
        System.out.print("Digite o número da mesa: ");
        int numMesa = Integer.parseInt(scanner.nextLine());
        Mesas mesaSelecionada = null;
        for (Mesas m : mesas) {
            if (m.getNumero() == numMesa) {
                mesaSelecionada = m;
                break;
            }
        }
        if (mesaSelecionada == null) {
            System.out.println("Mesa não encontrada.");
            return;
        }
        List<Pratos> pratosPedido = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o nome do prato para adicionar ao pedido (ou 'sair' para finalizar): ");
            String nomePrato = scanner.nextLine();
            if (nomePrato.equalsIgnoreCase("Sair")) {
                continuar = false;
                continue;
            }
            Pratos pratoSelecionado = null;
            for (Pratos p : pratos) {
                if (p.getNome().equalsIgnoreCase(nomePrato)) {
                    pratoSelecionado = p;
                    break;
                }
            }
            if (pratoSelecionado == null) {
                System.out.println("Prato não encontrado.");
            } else {
                pratosPedido.add(pratoSelecionado);
                System.out.println("Prato adicionado ao pedido!");
            }
        }
        double total = 0;
        for (Pratos p : pratosPedido) {
            total += p.getPreco();
        }
        pedidos.add(new Pedidos(mesaSelecionada, pratosPedido, total));
        System.out.println("Pedido criado com sucesso! Total: R$ " + total);
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
        } else {
            System.out.println("Pedidos registrados:");
            for (Pedidos p : pedidos) {
                System.out.println("Mesa: " + p.getMesa().getNumero()
                        + " | Total: R$ " + p.getTotal());
                System.out.print("Pratos: ");
                for (Pratos prato : p.getPratosPedido()) {
                    System.out.print(prato.getNome() + " ");
                }
                System.out.println("\n---");
            }
        }
    }

    public Pedidos() {
    }

    public Pedidos(Mesas mesa, List<Pratos> pratosPedido, double total) {
        this.mesa = mesa;
        this.pratosPedido = pratosPedido;
        this.total = total;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public List<Pratos> getPratosPedido() {
        return pratosPedido;
    }

    public double getTotal() {
        return total;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "mesa=" + mesa + ", pratosPedido=" + pratosPedido + ", total=" + total + ", pedidos=" + pedidos + ", scanner=" + scanner + '}';
    }

}
