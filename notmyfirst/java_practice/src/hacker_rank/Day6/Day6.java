//package hacker_rank.Day6;
//
//import java.util.Scanner;
//
//public class Day6 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String g_even = "";
//            String g_odd = "";
//            String k_even ="";
//            String k_odd = "";
//
//
//            int T = sc.nextInt();
//            sc.nextLine();
//            for (int i = 0; i < T; i++) {
//                String s = sc.next();
//                for (int j = 0; j < s.length(); j++) {
//                    if (j % 2 == 0)
//                        g_even += s.charAt(j);
//                    else if (j % 2 != 0)
//                        g_odd += s.charAt(j);
//                }
////                for (int k = 0; k < s.length(); k++) {
////                    if (k % 2 == 0)
////                        k_even += s.charAt(k);
////                    else if (k % 2 != 0)
////                        k_odd += s.charAt(k);
////                }
//
//
//                String g_total = g_even + " " + g_odd;
//                String k_total = k_even + " " + k_odd;
//                System.out.println(g_total);
//                System.out.println(k_total);
//
//
//
//            }
//            sc.close();
//        }
//    }
