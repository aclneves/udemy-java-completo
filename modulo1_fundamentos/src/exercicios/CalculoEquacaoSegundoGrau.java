package exercicios;

import java.util.Scanner;

public class CalculoEquacaoSegundoGrau {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero do elemento 'a' na equação de segundo grau: ");
        a = in.nextInt();
        System.out.print("Digite o numero do elemento 'b' na equação de segundo grau: ");
        b = in.nextInt();
        System.out.print("Digite o numero do elemento 'c' na equação de segundo grau: ");
        c = in.nextInt();

        in.close();

        System.out.printf("\nA equação de segundo grau é: %dx² %+dx %+d = 0", a, b, c);


        double delta = Math.pow(b, 2) - (4 * a * c);

        double primeira_raiz = (-b + Math.sqrt(delta)) / (2 * a);
        double segunda_raiz = (-b - Math.sqrt(delta)) / (2 * a);


        System.out.printf("\n\nAs raízes dessa esquação de segundo grau são: \nx1 = %.2f \nx2 = %.2f",
                primeira_raiz, segunda_raiz);


    }
}
