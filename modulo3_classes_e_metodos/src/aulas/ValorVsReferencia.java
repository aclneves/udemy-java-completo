package aulas;

import exercicios.exercicio1.Data;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //atribuição por valor

        a++;
        b--;

        System.out.println("a = " + a + " " + "b = " + b);

        Data d1 = new Data();
        Data d2 = d1; //atribuição por referência

        d1.dia = 31;
        d1.mes = 12;
        d1.ano = 2025;

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        voltarDataParaValorPadrao(d1);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        int c = 5;
        alterarPrimitivo(5);
        System.out.println(c);

    }

    static void voltarDataParaValorPadrao(Data data) {
        data.dia = 1;
        data.mes = 1;
        data.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }
}
