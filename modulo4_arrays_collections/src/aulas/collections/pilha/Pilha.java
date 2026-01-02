package aulas.collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe"); // retorna um boolean
        livros.push("Don Quixote"); // retorna exceção se impossível adicionar
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.contains("Don Quixote"));

        System.out.println(livros.size());

        for (String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
        System.out.println(livros.poll());

        System.out.println(livros.isEmpty());

    }
}
