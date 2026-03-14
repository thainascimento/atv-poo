package com.fatec.ads;

// Classe que representa uma receita médica
public class Receita {

    private String consulta;
    private String data;
    private String descritivo;

    public Receita(){}

    public Receita(String consulta, String data, String descritivo){

        try{
            // Tentando atribuir os valores passados
            if(consulta == null || consulta.isEmpty()) throw new Exception();
            if(data == null || data.isEmpty()) throw new Exception();
            if(descritivo == null || descritivo.isEmpty()) throw new Exception();

            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;

        } catch(Exception e){
            // Captura qualquer exceção e define valores padrões
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");

            this.consulta = "";
            this.data = "";
            this.descritivo = "";
        }

    }

    public String getConsulta(){ return consulta; }
    public String getData(){ return data; }
    public String getDescritivo(){ return descritivo; }

    public void setConsulta(String consulta){
        try{
            if(consulta == null || consulta.isEmpty()) throw new Exception();
            this.consulta = consulta;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.consulta = "";
        }
    }

    public void setData(String data){
        try{
            if(data == null || data.isEmpty()) throw new Exception();
            this.data = data;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.data = "";
        }
    }

    public void setDescritivo(String descritivo){
        try{
            if(descritivo == null || descritivo.isEmpty()) throw new Exception();
            this.descritivo = descritivo;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.descritivo = "";
        }
    }

    public void mostrar(){
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descricao: " + descritivo);
    }

}