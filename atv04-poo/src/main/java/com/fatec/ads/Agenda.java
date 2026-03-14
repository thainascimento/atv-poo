package com.fatec.ads;

// Classe que representa uma agenda de consulta
public class Agenda {

    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda(){}

    public Agenda(String data, String hora, String medico, String paciente){

        try{
            if(data == null || data.isEmpty()) throw new Exception();
            if(hora == null || hora.isEmpty()) throw new Exception();
            if(medico == null || medico.isEmpty()) throw new Exception();
            if(paciente == null || paciente.isEmpty()) throw new Exception();

            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.paciente = paciente;

        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.data = "";
            this.hora = "";
            this.medico = "";
            this.paciente = "";
        }

    }

    public String getData(){ return data; }
    public String getHora(){ return hora; }
    public String getMedico(){ return medico; }
    public String getPaciente(){ return paciente; }

    public void setData(String data){
        try{
            if(data == null || data.isEmpty()) throw new Exception();
            this.data = data;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.data = "";
        }
    }

    public void setHora(String hora){
        try{
            if(hora == null || hora.isEmpty()) throw new Exception();
            this.hora = hora;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.hora = "";
        }
    }

    public void setMedico(String medico){
        try{
            if(medico == null || medico.isEmpty()) throw new Exception();
            this.medico = medico;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.medico = "";
        }
    }

    public void setPaciente(String paciente){
        try{
            if(paciente == null || paciente.isEmpty()) throw new Exception();
            this.paciente = paciente;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.paciente = "";
        }
    }

    public void mostrar(){
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Medico: " + medico);
        System.out.println("Paciente: " + paciente);
    }

}