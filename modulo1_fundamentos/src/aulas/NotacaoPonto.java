package aulas;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";

        s = s.replace("X", "Amigo");
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Antonio".toUpperCase());

        String y = "Bom dia X"
                .toUpperCase()
                .replace("X", "Antonio")
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem operador
    }

}
