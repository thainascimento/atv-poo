package com.fatec.ads;

/**
 * Hello world!
 *
 */
// Classe principal do programa
// É aqui que o Java começa a executar o sistema
public class App // public é uma classe q qualquer classe pode acessar
{

    // Método principal (main)
    // Todo programa Java começa a execução aqui
    public static void main(String[] args) {

        int x = 1; // variável usada para gerar códigos automáticos

        var p1 = new Paciente(); // Criando um objeto Paciente - usando o construtor SEM parâmetros
        // o var é uma forma de deixar o Java descobrir o tipo da variável
        // "Crie um objeto da classe Paciente e guarde na variável p1"

        // usando os setters para definir valores
        p1.setCodigo(x++);  // define o código do paciente
        p1.setNome("jose da silva"); // define o nome
        p1.setEmail("jose@norton.net.br"); // define o email

        p1.mostrar(); // chamando o método mostrar() - ele imprime os dados do paciente

        // Criando outro paciente - usando o construtor COM parâmetros
        var p2 = new Paciente(x++, "maria souza", "maria@norton.net.br");

        p2.mostrar(); // mostrando os dados do segundo paciente

        // Usando um GETTER
        // aqui estamos acessando o nome do paciente através do método getNome()
        System.out.println("Nome = " + p1.getNome());

    }

}
