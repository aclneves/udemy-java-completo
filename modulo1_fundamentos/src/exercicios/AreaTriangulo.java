package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo(cm): ");
        double base = in.nextDouble();
        System.out.print("Digite o valor da altura do triângulo(cm): ");
        double altura = in.nextDouble();

        in.close();

        double area_triangulo = (base * altura) / 2;

        System.out.printf("A área de um triângulo de base: %.2fcm e altura: %.2fcm é de: %.2fcm"
                , base, altura, area_triangulo);

    }
}
