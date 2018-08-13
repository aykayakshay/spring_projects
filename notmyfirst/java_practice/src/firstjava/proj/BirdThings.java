package firstjava.proj;

import java.util.*;

public class BirdThings extends HumanThings implements LivingThingsCommon {
    @Override
    public void CanWalk() {
        System.out.println("walks on two legs");
    }
    @Override
    public void EatsFood(){
        System.out.println("Insects, grass");
    }
    public void CanFly() {
        HashMap<String, Integer> hmap1 = new HashMap();
        hmap1.put("Eagle", 50);
        hmap1.put("Crow", 20);
        hmap1.put("KingFisher", 40);
        Set set = hmap1.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next(); // causes concurrent modification Exception
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    public void AreLittle(String s2) {
        try {
            if (s2.compareTo("Eagle") == 0) {
                System.out.println("Eagle is the largest, you're wrong");
            } else if (s2.compareTo("Crow") == 0) {
                System.out.println("Crow is the smallest, you're right");
            } else if (s2.compareTo("Kingfisher") == 0) {
                System.out.println("Kingfisher is neither the largest or smallest");
            } else if (s2.compareTo(null) == 0) {
                System.out.println(s2.toLowerCase());
            }
        }
        catch(Exception e){
            System.out.println("null pointer exception" + e);
        }
    }
}




