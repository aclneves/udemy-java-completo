package exercicios.exercicio1;

public class DataTeste {
    public static void main(String[] args) {

        Data data1 = new Data();

        Data data2 = new Data(4, 11, 2023);

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
