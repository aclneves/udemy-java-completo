package exercicios.fimModulo;

import java.text.DecimalFormat;
// import java.text.DecimalFormatSymbols;
// import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    /**
     * 3. Criar um programa que receba duas notas parciais, calcular a média
     * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
     * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
     * "Recuperação", caso contrário imprime no console "Reprovado".
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor digite a primeira nota: ");
        double nota1 = in.nextDouble();
        System.out.println("Por favor digite a segunda nota: ");
        double nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String mediaFormatada = df.format(media);

        System.out.println("Media final do aluno: " + mediaFormatada);

        String situacao = "";

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 4) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Situação do aluno: " + situacao);
        in.close();

    }
}
