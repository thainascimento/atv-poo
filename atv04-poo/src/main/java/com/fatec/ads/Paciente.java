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

        try{ 
            // validação manual para acionar exceção caso valor seja inválido
            if(codigo < 0) throw new Exception();
            if(nome == null || nome.isEmpty()) throw new Exception();
            if(email == null || email.isEmpty()) throw new Exception();

            this.codigo = codigo;
            this.nome = nome;
            this.email = email;

        }catch(Exception e){ 
            // captura erro caso algum valor seja inválido
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");

            this.codigo = 0;
            this.nome = "desconhecido";
            this.email = "sem email";
        }
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void setCodigo(int codigo){
        try{
            if(codigo < 0) throw new Exception();
            this.codigo = codigo;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.codigo = 0;
        }
    }

    public void setNome(String nome){
        try{
            if(nome == null || nome.isEmpty()) throw new Exception();
            this.nome = nome;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.nome = "desconhecido";
        }
    }

    public void setEmail(String email){
        try{
            if(email == null || email.isEmpty()) throw new Exception();
            this.email = email;
        } catch(Exception e){
            System.out.println("Ocorreu uma excecao - Valores padroes definidos");
            this.email = "sem email";
        }
    }

    public void mostrar() { 
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

}