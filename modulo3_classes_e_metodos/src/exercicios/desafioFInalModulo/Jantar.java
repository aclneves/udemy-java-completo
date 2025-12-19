package exercicios.desafioFInalModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida arroz = new Comida("Arroz", 0.3);
        Comida feijao = new Comida("Feijão", 0.2);
        Comida batataFrita = new Comida("Batata Frita", 0.1);
        Comida bifeMilanesa = new Comida("Bife à Milanesa", 0.3);


        Pessoa antonio = new Pessoa("Antonio", 85);

        System.out.println("Antes do jantar... ");
        System.out.println(antonio);

        System.out.println("\nComeçou o jantar... ");
        antonio.comer(arroz);
        antonio.comer(feijao);
        antonio.comer(batataFrita);
        antonio.comer(bifeMilanesa);


        System.out.println("\nDepois do jantar...");
        System.out.println(antonio);
    }
}
