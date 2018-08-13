package InterviewTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String s = "i love programming very much";
        String[] s1 =s.split(" ");
        List<String> l1 = new ArrayList(Arrays.asList(s1));
        for(int i=l1.size()-1;i>=0;i--)
            System.out.print(l1.get(i) + " ");


    }

}
