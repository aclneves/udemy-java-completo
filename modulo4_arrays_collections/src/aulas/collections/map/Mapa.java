package aulas.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Pedro");
        usuarios.put(1, "Ricardo"); // valor substituido

        System.out.println(usuarios);
        System.out.println(usuarios.size());

        usuarios.put(2, "Antonio");
        usuarios.put(3, "Maria");
        usuarios.put(4, "João");

        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());

        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Antonio"));

        System.out.println(usuarios.get(1));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " = " + registro.getValue());
        }

    }
}
