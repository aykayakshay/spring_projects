package InterviewTest;

import java.util.Map;
import java.util.TreeMap;

public class kaala {
    public static void main(String[] args) {

        int tmp =0;
        int sum= 0;
        String s = "aabbccddeefghi";
        Map<Character, Integer> h1 = new TreeMap();
        int[] list = new int[h1.size()];
        char[] c1 = s.toCharArray();
        for(char c: c1){
            if(h1.containsKey(c)){
                h1.put(c, h1.get(c) + 1);
            }
            if(!h1.containsKey(c)){
                h1.put(c,1);
            }
            sum = sum + h1.get(c);
            list[h1.get(c)]++;
            System.out.println(h1.get(c) + " ");

        }
        System.out.println(h1);

    }

}
