package aulas.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 6.2;
        String resultadoParcial= media >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = media >= 7 ? "aprovado" : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 9.1;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia ? true : false;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.println("Tem desconto? " + resultado);

    }

}
