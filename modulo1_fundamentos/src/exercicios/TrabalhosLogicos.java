package exercicios;

// Trabalho na terça
// Trabalho na quinta

import java.util.Scanner;

public class TrabalhosLogicos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Você trabalhou na terça? ([S]im ou [N]ão) ");
        String trabalhou_terca = in.nextLine();
        System.out.print("Você trabalhou na quinta? ([S]im ou [N]ão) ");
        String trabalhou_quinta = in.nextLine();

        // Ainda não foi ensinado if, por isso essa lógica
        boolean terca = trabalhou_terca.toLowerCase().contains("s");
        boolean quinta = trabalhou_quinta.toLowerCase().contains("s");

        boolean comprouTV50 = terca && quinta;
        boolean comprouTV32 = terca ^ quinta;
        boolean tomouSorvete = terca || quinta;
        boolean ficouEmCasa = !tomouSorvete;

        System.out.print("Comprou a TV de 50? ");
        System.out.println(comprouTV50);
        System.out.print("Comprou a TV de 32? ");
        System.out.println(comprouTV32);
        System.out.print("Tomou sorverte? ");
        System.out.println(tomouSorvete);
        System.out.print("Fiquei em casa: ");
        System.out.println(ficouEmCasa);

    }
}
