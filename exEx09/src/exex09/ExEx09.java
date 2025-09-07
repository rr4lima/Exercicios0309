package exex09;

public class ExEx09 {
    public static void main(String[] args) {
        Pratos p1 = new Pratos();
        p1.adcPrato();
        p1.listarPratos();

        Mesas m1 = new Mesas();
        m1.adcMesa();
        m1.listarMesas();

        Pedidos ped1 = new Pedidos();
        ped1.criarPedido(m1.getMesas(), p1.getPratos());
        ped1.listarPedidos();
    }
}
