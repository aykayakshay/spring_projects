package practise.tests;

import java.util.HashMap;

public class LeetAnagram {
    static boolean isAnagram(String s1, String s2) {

            String a = s1.toLowerCase();
            String b = s2.toLowerCase();
            HashMap<Character, Integer> hmap = new HashMap<>();
            HashMap<Character, Integer> hmap1 = new HashMap<>();
            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            for (char c : A) {
                if (hmap.containsKey(c)) {
                    hmap.put(c, hmap.get(c) + 1);
                } else {
                    hmap.put(c, 1);
                }
            }
            for (char c : B) {
                if (hmap1.containsKey(c)) {
                    hmap1.put(c, hmap1.get(c) + 1);
                } else {
                    hmap1.put(c, 1);
                }
            }

            System.out.println(hmap);
            System.out.println(hmap1);

            if (hmap.equals(hmap1))
                return true;
            else
                return false;
    }
    public static void main(String[] args) {
        boolean ret = isAnagram("CATtee", "ceetAt");
        //boolean ret = isAnagram("CATtee", "ceetat");
        System.out.println(ret);

    }
}
