package com.fatec.ads;

// Classe que representa uma agenda de consulta
public class Agenda {

    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda(){}

    public Agenda(String data, String hora, String medico, String paciente){

        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;

    }

    public String getData(){ return data; }

    public String getHora(){ return hora; }

    public String getMedico(){ return medico; }

    public String getPaciente(){ return paciente; }

    public void setData(String data){ this.data = data; }

    public void setHora(String hora){ this.hora = hora; }

    public void setMedico(String medico){ this.medico = medico; }

    public void setPaciente(String paciente){ this.paciente = paciente; }

    public void mostrar(){

        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);

    }

}