package exercicios;

public class ConversorTemperaturaCParaF {
    public static void main(String[] args) {

        final int AJUSTE = 32;
        final double FATOR = 9.0 / 5.0;


        double temperaturaCelsius = 30;
        double temperaturaFahrenheit = (temperaturaCelsius * FATOR) + AJUSTE;

        System.out.println(temperaturaCelsius + " grauss Celsius é igual a "
                + temperaturaFahrenheit + " graus Fahrenheit");


    }
}
