package exex08;

public class ExEx08 {
    public static void main(String[] args) {
        Projetos pj1 = new Projetos();
        pj1.adcProjeto();
        pj1.listarProjetos();

        Desenvolvedores d1 = new Desenvolvedores();
        d1.adcDesenvolvedor();
        d1.listarDesenvolvedores();

        Tarefas t1 = new Tarefas();
        t1.atribuirTarefa(pj1.getProjetos(), d1.getDesenvolvedores());
        t1.listarTarefas();
    }
}
