package exex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

    private Medicos medico;
    private Pacientes paciente;
    private String data;
    private List<Consultas> consultas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void agendCons(List<Medicos> medicos, List<Pacientes> pacientes) {
        if (medicos.isEmpty() || pacientes.isEmpty()) {
            System.out.println("Não é possível agendar. Cadastre médicos e pacientes primeiro.");
            return;
        }

        System.out.println("Agendamento de Consultas");

        System.out.println("Escolha o médico:");
        for (int i = 0; i < medicos.size(); i++) {
            System.out.println((i + 1) + " - " + medicos.get(i).getNome());
        }
        int escolhaMed = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println("Escolha o paciente:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + " - " + pacientes.get(i).getNome());
        }
        int escolhaPac = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Digite a data da consulta: ");
        String dataConsulta = scanner.nextLine();

        consultas.add(new Consultas(medicos.get(escolhaMed), pacientes.get(escolhaPac), dataConsulta));
        System.out.println("Consulta agendada com sucesso!");
    }

    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
        } else {
            System.out.println("Consultas agendadas:");
            for (Consultas c : consultas) {
                System.out.println("Médico: " + c.getMedico().getNome() +
                                   " | Paciente: " + c.getPaciente().getNome() +
                                   " | Data: " + c.getData());
            }
        }
    }

    public Consultas() {
    }

    public Consultas(Medicos medico, Pacientes paciente, String data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Consultas> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consultas> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Consultas{" + "medico=" + medico.getNome() + ", paciente=" + paciente.getNome() + ", data=" + data + '}';
    }
}
