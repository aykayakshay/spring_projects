package hacker_rank.List;

import java.util.LinkedList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> l = new LinkedList();
        for(int i=0;i<n;i++){
            int y =in.nextInt();
            l.add(y);
        }
        int n1 = in.nextInt();
        for(int i=0;i<n1;i++) {
            String s = in.next();
            if (s.equals("Insert")) {
                int x = in.nextInt();
                int y = in.nextInt();
                l.add(x, y);
            } else {
                int x = in.nextInt();
                l.remove(x);
            }
        }
            in.close();
            for(Integer iw : l){
                System.out.print(iw + " ");
            }
    }
}
