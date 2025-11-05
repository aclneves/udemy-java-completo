package aulas;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = in.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota >= 8.5) {
            System.out.println("Conceito A");
        } else if (nota >= 7) {
            System.out.println("Conceito B");
        } else if (nota >= 5.5) {
            System.out.println("Conceito C");
        } else if (nota >= 3.5) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }

        System.out.println("Fim do programa");
    }
}
