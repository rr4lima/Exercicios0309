package exex04;

import exex04.Voos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reservas {

    private String codVoos;
    private Voos voo;
    private int assentosReservados;
    private String nomePassageiro;
    List<Reservas> reserva = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void realizarReserva(List<Voos> voosDisponiveis) {
    boolean continuar = true;

    while (continuar) {
        System.out.println("Você deseja realizar uma reserva? 1 Para sim e 2 para não.");
        String resposta = scanner.nextLine();

        if (resposta.equals("1")) {
            System.out.println("Digite o código de voo: ");
            String codigoVoo = scanner.nextLine();

            Voos vooSelecionado = null;
            for (Voos v : voosDisponiveis) {
                if (v.getCodVoo().equalsIgnoreCase(codigoVoo)) {
                    vooSelecionado = v;
                    break;
                }
            }

            if (vooSelecionado == null) {
                System.out.println("Voo não encontrado.");
                continue;
            }

            System.out.println("Digite o nome do passageiro: ");
            String nomePassageiro = scanner.nextLine();

            System.out.println("Quantos assentos deseja reservar?");
            int assentos = scanner.nextInt();
            scanner.nextLine();

            if (assentos <= 0) {
                System.out.println("Quantidade de assentos insuficiente.");
                continue;
            }
            if (vooSelecionado.getAssDisp() >= assentos) {
                vooSelecionado.setAssDisp(vooSelecionado.getAssDisp() - assentos);
                reserva.add(new Reservas(vooSelecionado.getCodVoo(), vooSelecionado, assentos, nomePassageiro));
                System.out.println("Reserva realizada com sucesso.");
            } else {
                System.out.println("Assentos insuficientes. Disponíveis: " + vooSelecionado.getAssDisp());
            }

        } else if (resposta.equals("2")) {
            System.out.println("Registro de voo cancelado.");
            continuar = false;
            break;
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

public void verificarReservas() {
    if (reserva.isEmpty()) {
        System.out.println("Nenhuma reserva registrada.");
    } else {
        for (Reservas r : reserva) {
            System.out.println("Passageiro: " + r.getNomePassageiro() + " | " +"Assentos reservados: " + r.getAssentosReservados());
           
        }
    }
}

//    public void realizarReserva(List<Voos> voosDisponiveis) {
//        boolean continuar = true;
//
//        while (continuar) {
//            System.out.println("Você deseja realizar uma reserva? 1 Para sim e 2 para não.");
//            String resposta = scanner.nextLine();
//
//            if (resposta.equals("1")) {
//                System.out.println("Digite o código de voo: ");
//                String codigoVoo = scanner.nextLine();
//
//                Voos vooSelecionado = null;
//                for (Voos v : voosDisponiveis) {
//                    if (v.getCodVoo().equalsIgnoreCase(codigoVoo)) {
//                        vooSelecionado = v;
//                        break;
//                    }
//                }
//
//                System.out.println("Digite o destino do voo: ");
//                String destinoVoo = scanner.nextLine();
//
//                System.out.println("Assentos disponíveis: ");
//                int assentos = scanner.nextInt();
//                scanner.nextLine();
//
////                reservas.add();
//            } else if (resposta.equals("2")) {
//                System.out.println("Registro de voo cancelado. ");
//                continuar = false;
//                break;
//            } else {
//                System.out.println("Opção inválida.");
//            }
//        }
//    }

    public Reservas() {
    }

    public Reservas(String codVoos, Voos voo, int assentosReservados, String nomePassageiro) {
        this.codVoos = codVoos;
        this.voo = voo;
        this.assentosReservados = assentosReservados;
        this.nomePassageiro = nomePassageiro;
    }

    public String getCodVoos() {
        return codVoos;
    }

    public void setCodVoos(String codVoos) {
        this.codVoos = codVoos;
    }

    public Voos getVoo() {
        return voo;
    }

    public void setVoo(Voos voo) {
        this.voo = voo;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }

    public void setAssentosReservados(int assentosReservados) {
        this.assentosReservados = assentosReservados;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public List<Reservas> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reservas> reserva) {
        this.reserva = reserva;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

}
