package exex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
    private String titulo;
    private String descricao;
    private Desenvolvedores responsavel;
    private Projetos projeto;
    private List<Tarefas> tarefas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void atribuirTarefa(List<Projetos> projetos, List<Desenvolvedores> devs) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Deseja atribuir uma nova tarefa? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o título da tarefa: ");
                String titulo = scanner.nextLine();

                System.out.print("Digite a descrição da tarefa: ");
                String desc = scanner.nextLine();

                System.out.print("Digite o nome do projeto: ");
                String nomeProj = scanner.nextLine();
                Projetos projetoSelecionado = null;
                for (Projetos p : projetos) {
                    if (p.getNome().equalsIgnoreCase(nomeProj)) {
                        projetoSelecionado = p;
                        break;
                    }
                }
                if (projetoSelecionado == null) {
                    System.out.println("Projeto não encontrado.");
                    continue;
                }

                System.out.print("Digite o nome do desenvolvedor responsável: ");
                String nomeDev = scanner.nextLine();
                Desenvolvedores devSelecionado = null;
                for (Desenvolvedores d : devs) {
                    if (d.getNome().equalsIgnoreCase(nomeDev)) {
                        devSelecionado = d;
                        break;
                    }
                }
                if (devSelecionado == null) {
                    System.out.println("Desenvolvedor não encontrado.");
                    continue;
                }

                tarefas.add(new Tarefas(titulo, desc, devSelecionado, projetoSelecionado));
                System.out.println("Tarefa atribuída com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Atribuição de tarefas encerrada.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa atribuída.");
        } else {
            System.out.println("Tarefas atribuídas:");
            for (Tarefas t : tarefas) {
                System.out.println("Título: " + t.getTitulo() +
                        " | Projeto: " + t.getProjeto().getNome() +
                        " | Responsável: " + t.getResponsavel().getNome());
            }
        }
    }

    public Tarefas() {}

    public Tarefas(String titulo, String descricao, Desenvolvedores responsavel, Projetos projeto) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.projeto = projeto;
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public Desenvolvedores getResponsavel() { return responsavel; }
    public Projetos getProjeto() { return projeto; }
    public List<Tarefas> getTarefas() { return tarefas; }

    @Override
    public String toString() {
        return "Tarefas{" + "titulo=" + titulo + ", descricao=" + descricao + ", responsavel=" + responsavel + ", projeto=" + projeto + ", tarefas=" + tarefas + ", scanner=" + scanner + '}';
    }
    

}
