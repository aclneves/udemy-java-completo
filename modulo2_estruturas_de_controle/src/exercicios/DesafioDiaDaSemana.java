package exercicios;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia_digitado = in.nextLine();

        in.close();
        
        if (dia_digitado.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        } else if (dia_digitado.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        } else if (dia_digitado.equalsIgnoreCase("Terça")) {
            System.out.println(3);
        } else if (dia_digitado.equalsIgnoreCase("Quarta")) {
            System.out.println(4);
        } else if (dia_digitado.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        } else if (dia_digitado.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        } else if (dia_digitado.equalsIgnoreCase("Sábado")) {
            System.out.println(7);
        } else {
            System.out.println("Isso não é um dia da semana");
        }
    }
}
