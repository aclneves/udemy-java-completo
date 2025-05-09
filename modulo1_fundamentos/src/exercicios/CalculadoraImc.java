package exercicios;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o seu peso(Kg): ");
        double peso = in.nextDouble();
        System.out.print("Digite a sua altura(m): ");
        double altura = in.nextDouble();

        in.close();

        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("O seu imc é: %.2f", imc);


    }
}
