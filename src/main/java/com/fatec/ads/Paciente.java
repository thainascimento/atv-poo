package com.fatec.ads;

// public é uma classe q qualquer classe pode acessar
public class Paciente { // Classe que representa um paciente do sistema

    // Atributos da classe (dados do paciente)
    // private significa que só podem ser acessados pela própria classe
    private int codigo;
    private String nome;
    private String email;
    
    public Paciente() { // Construtor SEM parâmetros - cria um paciente vazio

        codigo = 0;
        nome = "";
        email = "";

    }
    
    public Paciente(int codigo, String nome, String email) {
    // Construtor COM parâmetros - permite criar o objeto já com os dados    
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;

    }

    public int getCodigo() { // GETTERS - usados para CONSULTAR valores
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(int codigo) { // SETTERS -- usados para ALTERAR valores
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrar() { // Método mostrar() mostra os dados do paciente

        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

    }

}