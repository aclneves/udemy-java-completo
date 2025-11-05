package exercicios.fimModulo;

import java.util.Scanner;

public class Exercicio5 {
    /**
     * 4. Criar um programa que receba um número e diga se ele é um número primo.
     * Usando Switch
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro para verificar se é primo:");
        int numero = in.nextInt();
        int contadorDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDivisores++;
            }
        }

        switch (contadorDivisores) {
            case 0:
                System.out.println("O número " + numero + " é primo.");
                break;
            default:
                System.out.println("O número " + numero + " não é primo.");
                break;
        }

        in.close();
    }
}
