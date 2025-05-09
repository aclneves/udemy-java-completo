package aulas;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String palavra = "";

        while (!palavra.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            palavra = in.nextLine();
        }

        System.out.println("tchau!");
    }
}
