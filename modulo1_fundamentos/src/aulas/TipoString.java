package aulas;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.89;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);

        System.out.printf("A pessoa %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

        String frase = String.format("\nA pessoa %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
