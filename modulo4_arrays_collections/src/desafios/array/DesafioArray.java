package desafios.array;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade desejada de notas: ");
        int quantidadeDeNotas = in.nextInt();

        double[] notasDoAluno = new double[quantidadeDeNotas];

        for(int i = 0; i < notasDoAluno.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + " do aluno: ");
            notasDoAluno[i] = in.nextDouble();
        }

        double somaNotas = 0;
        for(double nota : notasDoAluno) {
            somaNotas += nota;
        }

        double media = somaNotas / notasDoAluno.length;
        System.out.println("A média do aluno é: " + media);

        in.close();
    }
}
