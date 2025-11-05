package exercicios.fimModulo;

import java.util.Scanner;

public class Exercicio8 {
    /**
     * 8. Crie um programa que recebe 10 valores e ao final imprima o maior número.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int contador = 0;
        int maiorNumero = Integer.MIN_VALUE;
        do {
            System.out.println("Digite um número inteiro: ");
            int numeroDigitado = in.nextInt();

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }
            contador++;
        } while (contador < 10);

        System.out.println("O maior número digitado foi: " + maiorNumero);
        in.close();

    }
}
