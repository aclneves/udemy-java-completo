package aulas;

public class VariaveisEConstantes {
    public static void main(String[] args) {

        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println("Área 1 = " + area +"m2");

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área 2 = " + area + "m2");


    }
}
