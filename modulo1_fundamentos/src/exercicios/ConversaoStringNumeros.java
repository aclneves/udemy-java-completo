package exercicios;

import java.util.Scanner;

public class ConversaoStringNumeros {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro salário: ");
        String valor1 = in.nextLine();
        System.out.println("Por favor digite o segundo salário: ");
        String valor2 = in.nextLine();
        System.out.println("Por favor digite o terceiro salário: ");
        String valor3 = in.nextLine();

        double salario_1 = Double.parseDouble(valor1.replace("," , "."));
        double salario_2 = Double.parseDouble(valor2.replace("," , "."));
        double salario_3 = Double.parseDouble(valor3.replace("," , "."));
        double total = salario_1 + salario_2 + salario_3;

        System.out.println("A média dos 3 salários: " + total/3);

        in.close();
    }
}
