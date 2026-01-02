package aulas.equals_hashcode;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro", "pedro@email.com"));
        usuarios.add(new Usuario("Antonio", "antonio@email.com"));
        usuarios.add(new Usuario("Joao", "joao@email.com"));

        boolean resultado = usuarios.contains(new Usuario("Pedro", "pedro@email.com"));
        System.out.println(resultado);
    }
}
