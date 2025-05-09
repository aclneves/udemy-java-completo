package aulas;

public class For1 {
    public static void main(String[] args) {

        for (int i = 0; i <=20; i+=2 ) {
            System.out.printf("i = %d\n", i);
        }

        int x = 2;
        for(; x < 10; x++) {
            System.out.printf("x = %d\n", x);;
        }

        // Laço infintio
        // for(;true;) {
        //   System.out.println("fim");
        // }

    }
}
