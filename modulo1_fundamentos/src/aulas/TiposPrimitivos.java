package aulas;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Informações do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 544;
        int id = 56789;
        long pontosAcumumulados = 3_234_845_233L;

        // Tipos numéricos de ponto flutuante
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // tipo caracter
        char status = 'a'; // Ativo
        char unicode = '\u0010'; // Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumumulados / vendasAcumuladas);

        // Salário
        System.out.println("O funcionario " + id + " ganha: R$" + salario);

        // Ferias
        System.out.println("Está de férias: " + estaDeFerias);

        // Status
        System.out.println("Status: " + status + unicode);
    }
}
