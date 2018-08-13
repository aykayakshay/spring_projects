public class PalindromeNu {
    public static void main(String[] args) {
        int n = 998001;
        String s = Integer.toString(n);
        String s1="";

        while(n>0) {
            for (int i = s.length() - 1; i >= 0; i--) {
                s1 += s.charAt(i);
            }
            n--;
            if (s.equals(s1)) {
                System.out.println(s1);
                break;
            }


        }







    }
}
