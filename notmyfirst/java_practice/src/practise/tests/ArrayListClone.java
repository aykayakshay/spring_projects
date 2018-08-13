package practise.tests;

import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String a[]){
        ArrayList<Double> al = new ArrayList<Double>();
        al.add(2.2);
        al.add(2.1);
        al.add(1.9);
        al.add(1.8);
        al.add(1.7);
//        A[][]

        ArrayList<Double> al2 = new ArrayList<Double>(al);
//        al2.add("pple");
//        al2.add("range");
//        al2.add("ango");
//        al2.add("rapes");
//        al2.add("fruits");

//        ArrayList<String> al3 = (ArrayList<String>)al.clone();
//        System.out.println(al);
//        System.out.println(al3);
//        Collections.copy(al2,al);
        System.out.println(al2);
    }
}
