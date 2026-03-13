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

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;

    }

    // GETTERS - métodos para consultar os valores
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getSenha(){
        return senha;
    }
    
    // SETTERS - métodos para alterar valores
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void acessar(){ // método acessar()

    }
    
    public void mostrar(){ // método mostrar() - exibe os dados do recepcionista

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);

    }

}