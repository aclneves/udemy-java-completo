package aulas.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        // Tabela verdade AND
        System.out.println("\nTabela verdade AND:");
        System.out.print("V && V = ");
        System.out.println(true && true);
        System.out.print("V && F = ");
        System.out.println(true && false);
        System.out.print("F && V = ");
        System.out.println(false && true);
        System.out.print("F && F = ");
        System.out.println(false && false);

        // Tabela verdade OR
        System.out.println("\nTabela verdade OR:");
        System.out.print("V || V = ");
        System.out.println(true || true);
        System.out.print("V || F = ");
        System.out.println(true || false);
        System.out.print("F || V = ");
        System.out.println(false || true);
        System.out.print("F || F = ");
        System.out.println(false || false);

        // Tabela verdade XOR
        System.out.println("\nTabela verdade XOR:");
        System.out.print("V ^ V = ");
        System.out.println(true ^ true);
        System.out.print("V ^ F = ");
        System.out.println(true ^ false);
        System.out.print("F ^ V = ");
        System.out.println(false ^ true);
        System.out.print("F ^ F = ");
        System.out.println(false ^ false);

        // Tabela verdade NOT
        System.out.println("\nTabela verdade NOT");
        System.out.print("NOT true: ");
        System.out.println(!true);
        System.out.print("NOT false: ");
        System.out.println(!false);
    }

}
