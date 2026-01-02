package aulas.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHeterogeneo {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character


        System.out.println("Tamanho do conjunto: " + conjunto.size());

        conjunto.add("Teste");

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.remove(true));
        System.out.println(conjunto.remove("objeto"));

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        System.out.println(conjunto.contains("objeto"));
        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);
        System.out.println(conjunto);

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

        System.out.println(conjunto.isEmpty());
    }

}
