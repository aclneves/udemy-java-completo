package aulas;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = new String("texto");
        s.toLowerCase();

        int x = 123;
        // a. ≥ Tipos primitivos não contém métodos

        // Wrappers > Versão objetos dos tipos primitivos
        // Tudo em Java é um objeto, menos os tipos primitivos
        Integer y = 123;
        System.out.println(y.equals(123));

    }
}
