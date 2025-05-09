package exercicios;


public class CalculosAritimeticos {
    public static void main(String[] args) {

        double numerador_A = Math.pow((6 * (3 +2)), 2);
        double denominador_A = 3 * 2;
        double expressao_1 = numerador_A / denominador_A;
        System.out.println(expressao_1);
        double numerador_B = (1 - 5) * (2 - 7);
        double denominador_B = 2;
        double expressao_2 = Math.pow(numerador_B / denominador_B, 2);
        System.out.println(expressao_2);

        double numerador_total = Math.pow(expressao_1 - expressao_2, 3);
        double denominador_total = Math.pow(10, 3);

        double resultado = numerador_total / denominador_total;
        System.out.println("O resultado é: " + resultado);


    }
}
