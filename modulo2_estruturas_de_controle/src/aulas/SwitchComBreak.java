package aulas;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String conceito = "";

        System.out.println("Por favor digite a nota do aluno: ");
        int nota = in.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                break;
            default:
                conceito = "Nota inválida, conceito não encontrado";
        }

        System.out.println("O conceito do aluno é: " + conceito);
        in.close();
    }
}
