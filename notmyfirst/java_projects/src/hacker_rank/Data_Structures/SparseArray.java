package hacker_rank.Data_Structures;

import java.util.Scanner;

public class SparseArray {
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] count = new int[queries.length];
        int count1=0;
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<strings.length;j++){
                if(queries[i].equals(strings[j])){
                    count1++;
                }
            }
            count[i] = count1;
            count1=0;
        }



        return count;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int stringsCount = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[stringsCount];


            for (int i = 0; i < stringsCount; i++) {
                String stringsItem = scanner.nextLine();
                strings[i] = stringsItem;
            }



            int queriesCount = scanner.nextInt();
            scanner.nextLine();



            String[] queries = new String[queriesCount];


                for (int i = 0; i < queriesCount; i++) {
                    String queriesItem = scanner.nextLine();
                    queries[i] = queriesItem;
                }


            int[] res = matchingStrings(strings, queries);


            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");





        scanner.close();
    }
}

