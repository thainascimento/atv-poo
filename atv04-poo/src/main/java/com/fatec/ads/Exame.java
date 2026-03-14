package com.fatec.ads;

// Classe que representa um exame
public class Exame {

    private String consulta;
    private String data;
    private String descritivo;

    public Exame(){}

    public Exame(String consulta, String data, String descritivo){

        try{
            // Tentando atribuir os valores passados
            // se algum deles for nulo ou vazio, geramos uma exceção
            if(consulta == null || consulta.isEmpty()) throw new Exception();
            if(data == null || data.isEmpty()) throw new Exception();
            if(descritivo == null || descritivo.isEmpty()) throw new Exception();

            this.consulta = consulta;
            this.data = data;
            this.descritivo = descritivo;

        } catch(Exception e){
            // Captura qualquer erro ocorrido no try
            // Mensagem obrigatória da atividade
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");

            // Definindo valores padrão em caso de erro
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