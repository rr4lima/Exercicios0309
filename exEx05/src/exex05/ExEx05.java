package exex05;

public class ExEx05 {

    public static void main(String[] args) {
        Medicos m1 = new Medicos();
        m1.adcMedico();
        m1.listarMedicos();

        Pacientes p1 = new Pacientes();
        p1.adcPaciente();
        p1.listarPacientes();

        Consultas c1 = new Consultas();
        c1.agendCons(m1.getMedicos(), p1.getPacientes()); // ✅ corrigido
        c1.listarConsultas();
    }
}
