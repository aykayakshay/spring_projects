package practise.tests;

import java.util.HashMap;
import java.util.TreeMap;

class RepeatingChar {
    public static void main(String[] args) {
        String s = "aaaaabbbccccdddddeeefff";
        HashMap<Character, Integer> hmap = new HashMap();
        char[] strArray = s.toCharArray();
        for (char c : strArray) {
            if (hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c) + 1);
            } else {
                hmap.put(c, 1);
            }
        }
        System.out.println(hmap);
        TreeMap<Character, Integer> ascsorted = new TreeMap<>();
        ascsorted.putAll(hmap);
        System.out.println(ascsorted);
//        TreeMap<Character, Integer> dessorted = new TreeMap<>(Collections.reverseOrder());
//        dessorted.putAll(ascsorted);
//        System.out.println(dessorted);

        System.out.println(hmap.keySet());


        System.out.println(hmap.values());





    }

}