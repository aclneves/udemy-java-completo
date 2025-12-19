package aulas.produto;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {
    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }


    public double precoComDesconto() {
        return preco * (1 - (desconto));
    }

    public double precoComDesconto(double descontDoGerente) {
        return preco * (1 - (desconto + descontDoGerente));
    }
}
