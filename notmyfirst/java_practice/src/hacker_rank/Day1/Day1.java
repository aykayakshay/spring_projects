package hacker_rank.Day1;

import java.util.Scanner;
    public class Day1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            double b = scan.nextDouble();
            scan.nextLine();
            String c = scan.nextLine();

            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";
            String e = s + c;

            System.out.println(i + a);
            System.out.println(d + b);
            System.out.println(e);
        }
    }
