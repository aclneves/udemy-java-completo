package aulas.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {

        SortedSet<String> lista = new TreeSet<>(); // Garante ordem de inserção
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Maria");
        lista.add("Pedro");

        for (String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros);
    }
}
