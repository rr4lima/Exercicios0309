package exex06;

public class ExEx06 {

    public static void main(String[] args) {
        Marcas marca = new Marcas();
        marca.adcMarca();
        marca.listarMarcas();

        Vendedores vendedor = new Vendedores();
        vendedor.adcVendedor();
        vendedor.listarVendedores();

        Carros carro = new Carros();
        carro.adcCarro(marca.getMarcas(), vendedor.getVendedores());
        carro.listarCarros();

        carro.calcularMediaPorMarca("Toyota");
        carro.exibirCarrosVendidos("João");
    }
}
