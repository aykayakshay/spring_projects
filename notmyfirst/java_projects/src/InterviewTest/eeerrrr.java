package InterviewTest;

import java.util.HashMap;
import java.util.Map;

public class eeerrrr {
    static boolean checkMagazine(String[] magazine, String[] note) {
            Map<String, Integer> h1 = new HashMap<String, Integer>();
            Map<String, Integer> h2 = new HashMap<String, Integer>();

            for(String word: magazine){
                if (!h1.containsKey(word)) h1.put(word, 0);
                h1.put(word, h1.get(word) + 1);
            }

            for(String word: note){
                if (!h2.containsKey(word)) h2.put(word, 0);
                h2.put(word, h2.get(word) + 1);
            }

            for(String key: h2.keySet()){
                if (!h1.containsKey(key))
                    return false;
                int needed = h2.get(key);
                if (h1.get(key) < needed)
                    return false;
            }

            return true;






        }





    public static void main(String[] args) {
        String[] s1 = {"give", "me", "one", "grand", "today", "night"};
        String[] s2 = {"give", "one", "grand", "today"};
         checkMagazine(s1, s2);

    }
}

