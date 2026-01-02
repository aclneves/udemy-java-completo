package desafios.matriz;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {

        Scanner in = new  Scanner(System.in);

        System.out.print("Digite a quantidade de alunos:  ");
        int quantidadeDeAlunos = in.nextInt();

        System.out.print("Digite a quantidade de notas:  ");
        int quantidadeDeNotas = in.nextInt();

        double[][] notasDaTurma = new double[quantidadeDeAlunos][quantidadeDeNotas];

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++) {
            for(int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Digite a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = in.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (quantidadeDeAlunos * quantidadeDeNotas);
        System.out.println("A média da tumra é " + media);

        for(double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
    }
}
