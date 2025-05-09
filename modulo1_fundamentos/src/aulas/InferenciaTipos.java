package aulas;

public class InferenciaTipos {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);


        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        c = "Outro Texto";
        System.out.println(c);

        // c = 4.5; Não é possível realizar, pois Java é fortimente tipado, e mesmo com a inferência, não pode
        // ser trocado o tipo

        double d; // variável declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // variável utilizada;

        // Não é possível declarar e não inicializar usando var, deve ser inicializada na declaração.
    }
}
