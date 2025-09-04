//package ex01;
//
//public class Ex01 {
//
//    public static void main(String[] args) {
//
////        Produtos estoque = new Produtos();
////        estoque.adcProd();
//
//        Fornecedores f1 = new Fornecedores("Mateus");
//        f1.adcProdFornc();
//        f1.listarProd();
//
//        Pedidos pedido1 = new Pedidos();
//        pedido1.pedirProd();
//        pedido1.listarProd();
//    }
//}
package ex01;

public class Ex01 {

    public static void main(String[] args) {

        // Cadastro de produtos do fornecedor
        Fornecedores f1 = new Fornecedores("Mateus");
        f1.adcProdFornc();
        f1.listarProd();

        // Pedidos feitos pelos clientes
        Pedidos pedido1 = new Pedidos(f1);
        pedido1.pedirProd();
        pedido1.listarProd();
    }
}
