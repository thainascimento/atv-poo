package com.fatec.ads;

// Classe que representa um exame
public class Exame {

    private String consulta;
    private String data;
    private String descritivo;

    public Exame(){}

    public Exame(String consulta, String data, String descritivo){

        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;

    }

    public String getConsulta(){ return consulta; }

    public String getData(){ return data; }

    public String getDescritivo(){ return descritivo; }

    public void setConsulta(String consulta){ this.consulta = consulta; }

    public void setData(String data){ this.data = data; }

    public void setDescritivo(String descritivo){ this.descritivo = descritivo; }

    public void mostrar(){

        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descricao: " + descritivo);

    }

}