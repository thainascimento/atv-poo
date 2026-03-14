package com.fatec.ads;

// Classe que representa uma consulta 
public class Consulta {

    private String hora;
    private String data;
    private String motivo;
    private String historico;

    public Consulta(){} // Construtor vazio

    public Consulta(String hora, String data, String motivo, String historico){
    // Construtor COM parâmetros - permite criar o objeto já com os dados

        try{
            // tenta executar a atribuição dos valores
            this.hora = hora;
            this.data = data;
            this.motivo = motivo;
            this.historico = historico;

        }catch(Exception e){
            // captura erro caso ocorra exceção
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.hora = "";
            this.data = "";
            this.motivo = "";
            this.historico = "";
        }
    }

    public String getHora(){ return hora; }
    public String getData(){ return data; }
    public String getMotivo(){ return motivo; }
    public String getHistorico(){ return historico; }

    public void setHora(String hora){
        try{
            // tenta definir a hora
            this.hora = hora;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.hora = "";
        }
    }

    public void setData(String data){
        try{
            this.data = data;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.data = "";
        }
    }

    public void setMotivo(String motivo){
        try{
            this.motivo = motivo;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.motivo = "";
        }
    }

    public void setHistorico(String historico){
        try{
            this.historico = historico;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.historico = "";
        }
    }

    public void mostrar(){
        System.out.println("Hora: " + hora);
        System.out.println("Data: " + data);
        System.out.println("Motivo: " + motivo);
        System.out.println("Historico: " + historico);
    }

}