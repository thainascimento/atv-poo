package com.fatec.ads;

/**
 * Classe principal do programa
 * Aqui o Java começa a executar o sistema
 */
public class App {

    // Método principal (main)
    public static void main(String[] args) {

        int x = 1; // variável usada para gerar códigos automáticos
        
        // Testando Paciente
        System.out.println("---- Teste Paciente ----");
        var p1 = new Paciente(); // construtor sem parâmetros
        p1.setCodigo(x++);  
        p1.setNome("jose da silva"); 
        p1.setEmail("jose@norton.net.br"); 
        p1.mostrar();

        // Criando paciente com valores inválidos para disparar try/catch
        var p2 = new Paciente(-1, null, "");
        p2.mostrar();

        System.out.println("Nome = " + p1.getNome());

        // Testando Medico
        System.out.println("\n---- Teste Medico----");
        var m1 = new Medico();
        m1.setNome("Dr. Paulo");
        m1.setCrm("12345");
        m1.setTelefone("99999-9999");
        m1.setEspecialidade("Cardiologia");
        m1.setSenha("senha123");
        m1.mostrar();

        // Valores inválidos
        var m2 = new Medico(null, null, "", null, "");
        m2.mostrar();

        // Testando Recepcionista
        System.out.println("\n----- Teste Recepcionista ----");
        var r1 = new Recepcionista();
        r1.setNome("Ana");
        r1.setCpf("111.222.333-44");
        r1.setTelefone("98888-8888");
        r1.setSenha("abc123");
        r1.mostrar();

        var r2 = new Recepcionista(null, "", null, "");
        r2.mostrar();

        // Testando Consulta
        System.out.println("\n---- Teste Consulta ----");
        var c1 = new Consulta();
        c1.setHora("10:00");
        c1.setData("2026-03-13");
        c1.setMotivo("Rotina");
        c1.setHistorico("Primeira consulta");
        c1.mostrar();

        var c2 = new Consulta(null, "", null, "");
        c2.mostrar();

        // Testando Agenda
        System.out.println("\n---- Teste Agenda ----");
        var a1 = new Agenda();
        a1.setData("2026-03-14");
        a1.setHora("15:00");
        a1.setMedico("Dr. Carlos");
        a1.setPaciente("Maria Souza");
        a1.mostrar();

        var a2 = new Agenda("", null, null, "");
        a2.mostrar();

        // Testando Exame
        System.out.println("\n----Teste Exame ----");
        var e1 = new Exame();
        e1.setConsulta("Consulta 1");
        e1.setData("2026-03-14");
        e1.setDescritivo("Exame de sangue");
        e1.mostrar();

        var e2 = new Exame(null, "", null);
        e2.mostrar();

        // Testando Receita
        System.out.println("\n---- Teste Receita ----");
        var rec1 = new Receita();
        rec1.setConsulta("Consulta 2");
        rec1.setData("2026-03-15");
        rec1.setDescritivo("Dipirona 500mg");
        rec1.mostrar();

        var rec2 = new Receita(null, "", null);
        rec2.mostrar();

    }
}