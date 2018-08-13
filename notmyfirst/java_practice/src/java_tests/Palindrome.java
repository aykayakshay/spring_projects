package java_tests;

public class Palindrome {
    public static void main(String[] args) {
        String a = "1221";
        String b = "";

        int n = a.length()-1;
        while(n>=0){
            b += a.charAt(n);
            n--;
        }


//        for(int i = a.length()-1;i>=0;i--){
//            b += a.charAt(i);
//        }
//        System.out.println(b);
//        System.out.println(a);

        if (a.equals(b))
            System.out.println("is a palindrome");
        else
            System.out.println("is not a palindrome");


    }
}
