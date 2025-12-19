package exercicios.exercicio1;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);

        // byte, short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> '\u0000'
        // São os valores padrões dos tipos primitivos, se forem declarados sem atribuição.
        // Se uma variável for declarada dentro de um metodo, ela tem que ser declarada, assim quando for final.
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String obterDataFormatada() {
        final String formato = "%02d/%02d/%04d";
        return String.format(formato, dia, mes, ano);
    }

    public void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}
