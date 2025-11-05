package exercicios.fimModulo;

import java.time.LocalDate;


public class Exercicio2 {
    /** 2. Criar um programa informa se o ano atual é um ano bissexto; */

    public static void main(String[] args) {
        System.out.println("Vamos pegar o ano atual");
        System.out.println("Gerando...");

        int anoAtual = LocalDate.now().getYear();


        System.out.println("O ano atual é: " + anoAtual);

        System.out.println("Verificando se ele é bissexto...");

        if (anoAtual % 100 != 0 && anoAtual % 4 == 0) {
            System.out.println("O ano " + anoAtual + " é bissexto");
        } else if (anoAtual % 400 == 0) {
            System.out.println("O ano " + anoAtual + " é bissexto");
        } else {
            System.out.println("O ano " + anoAtual + " não é bissexto");

        }
    }
}
