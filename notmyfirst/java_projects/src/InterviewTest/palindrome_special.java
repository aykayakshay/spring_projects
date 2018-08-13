package InterviewTest;

public class palindrome_special {
    public static void main(String[] args) {
        String s= "abcbaba";
        int count =s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i] == ch[i+1])
                count++;
            if(ch[i] == ch[i+2])
                count++;


        }
        System.out.println(count);



    }
}
