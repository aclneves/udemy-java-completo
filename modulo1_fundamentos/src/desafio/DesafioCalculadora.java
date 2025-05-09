package desafio;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        String operacao = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = in.nextDouble();
        System.out.print("\nDigite o segundo número: ");
        numero2 = in.nextDouble();
        System.out.print("\nDigite a operação desejada (+ - * / %): ");
        in.nextLine();
        operacao = in.next();

        in.close();

        resultado = operacao.equals("+") ? numero1 + numero2 : resultado;
        resultado = operacao.equals("-") ? numero1 - numero2 : resultado;
        resultado = operacao.equals("*") ? numero1 * numero2 : resultado;
        resultado = operacao.equals("/") ? numero1 / numero2 : resultado;
        resultado = operacao.equals("%") ? numero1 % numero2 : resultado;

        System.out.printf("\nResultado: %.2f %s %.2f = %.2f ", numero1, operacao, numero2, resultado);

    }
}
