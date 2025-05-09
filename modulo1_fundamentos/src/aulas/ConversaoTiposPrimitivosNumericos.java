package aulas;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1; // conversão implícita
        System.out.println(a);

        float b = (float) 1.123455145747; // conversão explícita, nesse caso desnecessária e será truncado
        System.out.println(b);

        double c = 1.123455145747;
        System.out.println(c);

        int d = 4;
        byte e = (byte) d; // conversão explícita, não terá problema, mas se for maior causa problema
        System.out.println(e);
        e = (byte) 128;
        System.out.println(e);

        double f = 1.9999999999;
        int g = (int) f;
        System.out.println(g);
    }
}
