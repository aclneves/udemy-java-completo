package exercicios;

import java.util.Scanner;

public class QuadradoCuboValores {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor = in.nextDouble();

        in.close();

        double valor_ao_quadrado = Math.pow(valor, 2);
        double valor_ao_cubo = Math.pow(valor, 3);

        System.out.printf("\nO valor de %.2f ao quadrado é: %.2f", valor, valor_ao_quadrado);
        System.out.printf("\nO valor de %.2f ao cubo é: %.2f", valor, valor_ao_cubo);
    }
}
