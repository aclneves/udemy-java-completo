package exercicios;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {

        double peso = 0;
        double altura = 0;
        double imc = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o seu peso(Kg): ");
        peso = in.nextDouble();
        System.out.print("Digite a sua altura(m): ");
        altura = in.nextDouble();

        in.close();

        imc = peso / (Math.pow(altura, 2));
        System.out.printf("O seu imc é: %.2f", imc);


    }
}
