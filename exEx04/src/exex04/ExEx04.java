
package exex04;

public class ExEx04 {


    public static void main(String[] args) {
//       Passageiros p1 = new Passageiros();
//       p1.adcPass();
//       p1.listarPass();
       
       Voos v1 = new Voos();
       v1.adcVoo();
       v1.listarVoo();
       
       Reservas r1 = new Reservas();
       r1.realizarReserva(v1.getVoos());
       r1.verificarReservas();
       
    }
    
}
