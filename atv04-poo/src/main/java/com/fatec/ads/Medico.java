package com.fatec.ads;

// Classe que representa um médico no sistema
public class Medico {

    // Atributos da classe (dados do medico)
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico() { // construtor vazio - cria um medico vazio
        nome = "";
        crm = "";
        telefone = "";
        especialidade = "";
        senha = "";
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {
    // construtor com parâmetros - permite criar o objeto já com os dados 

        try{
            if(nome == null || nome.isEmpty()) throw new Exception();
            if(crm == null || crm.isEmpty()) throw new Exception();
            if(telefone == null || telefone.isEmpty()) throw new Exception();
            if(especialidade == null || especialidade.isEmpty()) throw new Exception();
            if(senha == null || senha.isEmpty()) throw new Exception();

            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.especialidade = especialidade;
            this.senha = senha;

        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.nome = "";
            this.crm = "";
            this.telefone = "";
            this.especialidade = "";
            this.senha = "";
        }
    }

    public String getNome() { return nome; }
    public String getCrm() { return crm; }
    public String getTelefone() { return telefone; }
    public String getEspecialidade() { return especialidade; }
    public String getSenha() { return senha; }

    public void setNome(String nome){
        try{
            if(nome == null || nome.isEmpty()) throw new Exception();
            this.nome = nome;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.nome = "";
        }
    }

    public void setCrm(String crm){
        try{
            if(crm == null || crm.isEmpty()) throw new Exception();
            this.crm = crm;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.crm = "";
        }
    }

    public void setTelefone(String telefone){
        try{
            if(telefone == null || telefone.isEmpty()) throw new Exception();
            this.telefone = telefone;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.telefone = "";
        }
    }

    public void setEspecialidade(String especialidade){
        try{
            if(especialidade == null || especialidade.isEmpty()) throw new Exception();
            this.especialidade = especialidade;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.especialidade = "";
        }
    }

    public void setSenha(String senha){
        try{
            if(senha == null || senha.isEmpty()) throw new Exception();
            this.senha = senha;
        }catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.senha = "";
        }
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
    }

}