package com.fatec.ads;

// Classe que representa a recepcionista do sistema
public class Recepcionista {

    // Atributos da classe - como private para aplicar encapsulamento 
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(){ // Construtor SEM parâmetros - cria um recepcionista vazio
        nome = "";
        cpf = "";
        telefone = "";
        senha = "";
    }

    // Construtor COM parâmetros - permite criar o objeto já com valores
    public Recepcionista(String nome, String cpf, String telefone, String senha){

        try{
            if(nome == null || nome.isEmpty()) throw new Exception();
            if(cpf == null || cpf.isEmpty()) throw new Exception();
            if(telefone == null || telefone.isEmpty()) throw new Exception();
            if(senha == null || senha.isEmpty()) throw new Exception();

            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.senha = senha;

        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.nome = "";
            this.cpf = "";
            this.telefone = "";
            this.senha = "";
        }

    }

    // GETTERS - métodos para consultar os valores
    public String getNome(){ return nome; }
    public String getCpf(){ return cpf; }
    public String getTelefone(){ return telefone; }
    public String getSenha(){ return senha; }

    // SETTERS - métodos para alterar valores
    public void setNome(String nome){
        try{
            if(nome == null || nome.isEmpty()) throw new Exception();
            this.nome = nome;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.nome = "";
        }
    }

    public void setCpf(String cpf){
        try{
            if(cpf == null || cpf.isEmpty()) throw new Exception();
            this.cpf = cpf;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.cpf = "";
        }
    }

    public void setTelefone(String telefone){
        try{
            if(telefone == null || telefone.isEmpty()) throw new Exception();
            this.telefone = telefone;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.telefone = "";
        }
    }

    public void setSenha(String senha){
        try{
            if(senha == null || senha.isEmpty()) throw new Exception();
            this.senha = senha;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.senha = "";
        }
    }

    public void acessar(){ 
        // método acessar() - pode ser implementado futuramente
    }

    public void mostrar(){ // método mostrar() - exibe os dados do recepcionista
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }

}