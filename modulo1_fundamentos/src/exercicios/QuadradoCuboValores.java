package exercicios;

import java.util.Scanner;

public class QuadradoCuboValores {
    public static void main(String[] args) {

        double valor = 0;
        double valor_ao_quadrado = 0;
        double valor_ao_cubo = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        valor = in.nextDouble();

        in.close();

        valor_ao_quadrado = Math.pow(valor, 2);
        valor_ao_cubo = Math.pow(valor, 3);

        System.out.printf("\nO valor de %.2f ao quadrado é: %.2f", valor, valor_ao_quadrado);
        System.out.printf("\nO valor de %.2f ao cubo é: %.2f", valor, valor_ao_cubo);
    }
}
