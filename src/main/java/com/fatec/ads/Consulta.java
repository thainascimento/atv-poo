package com.fatec.ads;

// Classe que representa uma consulta 
public class Consulta {

    private String hora;
    private String data;
    private String motivo;
    private String historico;

    // construtor vazio
    public Consulta(){}

    // construtor com parâmetros
    public Consulta(String hora, String data, String motivo, String historico){

        this.hora = hora;
        this.data = data;
        this.motivo = motivo;
        this.historico = historico;

    }

    // getters

    public String getHora(){ return hora; }

    public String getData(){ return data; }

    public String getMotivo(){ return motivo; }

    public String getHistorico(){ return historico; }

    // setters

    public void setHora(String hora){ this.hora = hora; }

    public void setData(String data){ this.data = data; }

    public void setMotivo(String motivo){ this.motivo = motivo; }

    public void setHistorico(String historico){ this.historico = historico; }

    // método mostrar

    public void mostrar(){

        System.out.println("Hora: " + hora);
        System.out.println("Data: " + data);
        System.out.println("Motivo: " + motivo);
        System.out.println("Historico: " + historico);

    }

}
