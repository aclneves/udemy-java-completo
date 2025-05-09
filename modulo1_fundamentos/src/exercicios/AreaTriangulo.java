package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        double base = 0;
        double altura = 0;
        double area_triangulo = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo(cm): ");
        base = in.nextDouble();
        System.out.print("Digite o valor da altura do triângulo(cm): ");
        altura = in.nextDouble();

        in.close();

        area_triangulo = (base * altura) / 2;

        System.out.printf("A área de um triângulo de base: %.2fcm e altura: %.2fcm é de: %.2fcm"
                , base, altura, area_triangulo);

    }
}
