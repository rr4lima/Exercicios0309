package exex10;

public class ExEx10 {
    public static void main(String[] args) {
        Estudantes e1 = new Estudantes();
        e1.adcEstudante();
        e1.listarEstudantes();

        Professores p1 = new Professores();
        p1.adcProfessor();
        p1.listarProfessores();

        Disciplinas d1 = new Disciplinas();
        d1.criarDisciplina(p1.getProfessores());
        d1.listarDisciplinas();

        e1.matricularDisciplina();
    }
}
