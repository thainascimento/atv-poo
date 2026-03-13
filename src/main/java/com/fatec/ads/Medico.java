package com.fatec.ads;

// Classe que representa um médico no sistema
public class Medico { // public é uma classe q qualquer classe pode acessar

    // Atributos da classe (dados do medico)
    // private significa que só podem ser acessados pela própria classe
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    // construtor vazio - cria um medico vazio
    public Medico() { // public é uma classe q qualquer classe pode acessar

        nome = "";
        crm = "";
        telefone = "";
        especialidade = "";
        senha = "";

    }

    // construtor com parâmetros - permite criar o objeto já com os dados 
    public Medico(String nome, String crm, String telefone, String especialidade, String senha) {

        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;

    }

    // getters - usados para CONSULTAR valores

    public String getNome() { return nome; }

    public String getCrm() { return crm; }

    public String getTelefone() { return telefone; }

    public String getEspecialidade() { return especialidade; }

    public String getSenha() { return senha; }

    // setters - usados para ALTERAR valores

    public void setNome(String nome) { this.nome = nome; }

    public void setCrm(String crm) { this.crm = crm; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public void setSenha(String senha) { this.senha = senha; }

    public void mostrar(){ // método mostrar()

        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);

    }

}