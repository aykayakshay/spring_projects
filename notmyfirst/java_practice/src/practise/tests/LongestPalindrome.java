package practise.tests;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        for(int i = s1.length()-1;i >=  0;i--){
            s2 += s1.charAt(i);

        for(int j=0; j < s1.length()-1;j++){
                s3 += s1.charAt(j);

        if (!s2.equals(s3)) {
            i--;
            j++;
            if(s1.charAt(j) == s1.charAt(i))
                s4 = s1.substring(j,i+1);
        }






        }


    }
}
}

// s2 += s1.charAt(i);