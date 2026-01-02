package aulas.collections.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // Exceção se der erro com fila cheia
        fila.offer("Bia"); // retornar um boolean se der erro cheia
        fila.offer("Carlos");
        fila.add("Daniel");
        fila.offer("Rafaela");
        fila.add("Gui");

        // Obter o próximo elemento da fila, sem remover
        System.out.println(fila.peek()); // retorna null se estiver vazia
        System.out.println(fila.peek());

        System.out.println(fila.element()); // Exceção se estiver vazia
        System.out.println(fila.element());

        System.out.println(fila.size());

        System.out.println(fila.contains("Rafaela"));

        //Poll e remove, obter o proximo elemento da fila e remover
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // lança exceção com fila vazia
        System.out.println(fila.poll()); // retorna null com fila vazia


        System.out.println(fila.isEmpty());

    }
}
