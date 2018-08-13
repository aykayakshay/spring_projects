package practise.tests;

public class RepeatCharSol {
    public static void main(String[] args) {
        String a = "aaaaabbbccccdddddeeefff";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(0) == a.charAt(i)) {
                count++;
            }
        }
        System.out.println(a.charAt(0) + count );
    }
}
