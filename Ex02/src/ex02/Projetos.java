package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projetos {
    String nomeProj;
    String adcProj;
    Scanner scanner = new Scanner(System.in);
    private List<String> projetosFeitos = new ArrayList<>();

    public Projetos() {
    }
    
   public void adcProj() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Você deseja adicionar um novo projeto para? 1 Para sim e 2 para não.");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.println("Digite o nome do projeto: ");
                String nomeProj = scanner.nextLine();

                System.out.println("Projeto adicionado com sucesso.");
               projetosFeitos.add(nomeProj);

            } else if (resposta.equals("2")) {
                System.out.println("Adição de projetos cancelada.");
                continuar = false;
                break;
            } else {
                System.out.println("Opção inválida.");
            }

        }
    }
   
      public void listarProj() {
        if (projetosFeitos.isEmpty()) {
            System.out.println("Nenhum projeto foi registrado.");
        } else {
            System.out.println("Projetos registrados: " + String.join(", ", projetosFeitos));
        }
    }
    

    public Projetos(String nomeProj, String adcProj) {
        this.nomeProj = nomeProj;
        this.adcProj = adcProj;
    }

    public String getNomeProj() {
        return nomeProj;
    }

    public void setNomeProj(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public String getAdcProj() {
        return adcProj;
    }

    public void setAdcProj(String adcProj) {
        this.adcProj = adcProj;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<String> getProjetosFeitos() {
        return projetosFeitos;
    }

    public void setProjetosFeitos(List<String> projetosFeitos) {
        this.projetosFeitos = projetosFeitos;
    }

    @Override
    public String toString() {
        return "Projetos{" + "nomeProj=" + nomeProj + ", adcProj=" + adcProj + ", scanner=" + scanner + ", projetosFeitos=" + projetosFeitos + '}';
    }


    
    
    
    
}


