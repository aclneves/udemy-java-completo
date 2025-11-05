package exercicios.fimModulo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    /**
     * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
     * um número aleatório em uma variável. O Jogador tem 10 tentativas para
     * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
     * de tentativas restantes, e imprima se o número inserido é maior ou menor do
     * que o número armazenado.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int numeroEscondido = random.nextInt(101);
        int tentativas = 0;

        while (tentativas < 10) {
            System.out.println("Tente adivinhar o número entre 0 e 100:");
            int palpite = in.nextInt();
            tentativas++;

            if (numeroEscondido == palpite) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else {
                if (numeroEscondido > palpite) {
                    System.out.println("O seu palpite " + palpite + " é menor do que o número escondido.");
                } else {
                    System.out.println("O seu palpite " + palpite + " é maior do que o número escondido.");
                }
                System.out.println("Tentativas restantes: " + (10 - tentativas));
            }
        }
    }
}
