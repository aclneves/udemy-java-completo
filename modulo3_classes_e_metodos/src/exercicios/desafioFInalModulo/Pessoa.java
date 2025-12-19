package exercicios.desafioFInalModulo;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
            System.out.println(this.nome + " comeu " + comida.nome);
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nPeso: %.2fkg", nome, peso);
    }
}
