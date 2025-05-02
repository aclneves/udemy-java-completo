package exercicios;

public class ConversorTemperaturaFParaC {
    public static void main(String[] args) {

        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;

        double temperaturaFahrenheit = 86;
        double temperaturaCelsius = (temperaturaFahrenheit - AJUSTE) * FATOR;

        System.out.println(temperaturaFahrenheit + " graus Fahrenheit é igual a "
                + temperaturaCelsius + " graus Celsius");


    }
}
