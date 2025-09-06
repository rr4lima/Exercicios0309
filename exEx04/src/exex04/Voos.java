package exex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voos {

    List<Voos> voos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String codVoo;
    private String origem;
    private String destino;
    private int assDisp;

    public void adcVoo() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um novo Voo? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o código de voo: ");
                String codigoVoo = scanner.nextLine();

                System.out.println("Digite a origem do voo: ");
                String origemVoo = scanner.nextLine();

                System.out.println("Digite o destino do voo: ");
                String destinoVoo = scanner.nextLine();

                System.out.println("Assentos disponíveis: ");
                int assentos = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Voo registrado com sucesso.");
                voos.add(new Voos(codigoVoo, origemVoo, destinoVoo, assentos));

            } else if (resposta.equals("2")) {
                System.out.println("Registro de voo cancelado. ");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarVoo() {
        if (voos.isEmpty()) {
            System.out.println("Nenhum voo foi registrado.");
        } else {
            for (Voos v : voos) {
                System.out.println("Voos registrados: ");
                System.out.println("Código de voo: " + v.getCodVoo() + " | " + "Origem do voo: "
                        + v.getOrigem() + "\n" + "Destino do voo: " + v.getDestino() + " | " + "Assentos disponíveis: "
                        + v.getAssDisp());
            }
        }
    }

    public Voos() {
    }

    public Voos(String codVoo, String origem, String destino, int assDisp) {
        this.codVoo = codVoo;
        this.origem = origem;
        this.destino = destino;
        this.assDisp = assDisp;
    }

    public List<Voos> getVoos() {
        return voos;
    }

    public void setVoos(List<Voos> voos) {
        this.voos = voos;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getCodVoo() {
        return codVoo;
    }

    public void setCodVoo(String codVoo) {
        this.codVoo = codVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAssDisp() {
        return assDisp;
    }

    public void setAssDisp(int assDisp) {
        this.assDisp = assDisp;
    }

}
