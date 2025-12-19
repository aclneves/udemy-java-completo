package exercicios.desafio;

// Tenho que conseguir imprimir o a, sem mexer na linha do código que declara a variável.
public class Desafio1 {

    int a = 3; // não pode mexer aqui
    static int b = 4; // Exemplo se pudesse mudar

    public static void main(String[] args) {
        Desafio1 d1 = new Desafio1();
        System.out.println(d1.a);

        System.out.println(b);
    }
}
