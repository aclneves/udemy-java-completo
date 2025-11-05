package exercicios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota = 0.0;
        double totalNotas = 0.0;
        int totalAlunos = 0;

        while (nota != -1) {
            System.out.println("Por favor digite uma nota ou -1 para sair: ");
            nota = in.nextDouble();
            if (nota > 0 && nota <= 10) {
                totalNotas += nota;
                totalAlunos++;
            } else if (nota != -1) {
                System.out.println("Você digitou uma nota inválida, tente novamente");
            }
        }

        System.out.println("A média total da turma foi de: " + (totalNotas / totalAlunos));
        in.close();
    }
}
