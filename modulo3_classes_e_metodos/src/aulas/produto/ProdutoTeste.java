package aulas.produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 5000);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 10;

        Produto.desconto = 0.50;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0.1);
        System.out.printf("Preço do %s R$%.2f\n", p1.nome, precoFinal1);

        double precoFinal2 = p2.precoComDesconto();
        System.out.printf("Preço do %s: R$%.2f\n", p2.nome, precoFinal2);

    }
}

