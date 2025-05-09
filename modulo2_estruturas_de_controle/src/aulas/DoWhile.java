package aulas;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Quer sair: ");
            texto = in.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado, tchau!");

        in.close();
    }
}
