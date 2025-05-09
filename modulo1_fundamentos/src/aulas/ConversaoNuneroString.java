package aulas;

public class ConversaoNuneroString {
    public static void main(String[] args) {

        Integer num1 = 100;
        System.out.println(num1.toString().length());

        int num2 = 2000;
        System.out.println(Integer.toString(num2).length());


        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
