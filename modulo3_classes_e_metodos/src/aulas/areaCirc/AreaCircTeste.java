package aulas.areaCirc;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(1);
        AreaCirc a2 = new AreaCirc(10);

        System.out.println(a1.area());
        System.out.println(a2.area());

        System.out.println(AreaCirc.area(100));

        System.out.println("PI (classe) = " + AreaCirc.PI);
        System.out.println("PI (Math) = " + Math.PI);
    }
}
