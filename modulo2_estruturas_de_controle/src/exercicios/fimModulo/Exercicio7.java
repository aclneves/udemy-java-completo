package exercicios.fimModulo;

import java.util.Scanner;

public class Exercicio7 {
    /**
     * 7. Criar um programa que enquanto estiver recebendo números positivos,
     * imprime no console a soma dos números inseridos, caso receba um número
     * negativo, encerre o programa. Tente utilizar a estrutura do while.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int somadorDeNumeros = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.println("Digite um número inteiro positivo(ou negativo para sair):  ");
            numero = in.nextInt();

            if(numero >= 0) {
                somadorDeNumeros += numero;
                System.out.println("A soma dos número até agora é: " + somadorDeNumeros);
            }
        }
        in.close();
    }
}
