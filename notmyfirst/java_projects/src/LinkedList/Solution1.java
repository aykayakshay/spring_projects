//package LinkedList;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Solution1 {
//
//    // Complete the arrayManipulation function below.
//    static long arrayManipulation(int n, int[][] queries) {
//        int max =0;
//        int sum=0;
//        int count =0;
//        int[] a = new int[n];
//        for(int i=0;i<n;i++){
//            a[i] =0;
//        }
//
//        for (int i = 0; i < queries.length; i++) {
//            for (int j = 0; j < queries.length - 1; j++) {
//                for(int k = 1;k < n; k++){
//                    while(queries[i][j] <= queries[i][j+1]) {
//                        ++count;
//                        a[(queries[i][j])-k]
//                    }
//
//                }
//
//
//
//            }
//        }
//
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nm = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nm[0]);
//
//        int m = Integer.parseInt(nm[1]);
//
//        int[][] queries = new int[m][3];
//
//        for (int i = 0; i < m; i++) {
//            String[] queriesRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 3; j++) {
//                int queriesItem = Integer.parseInt(queriesRowItems[j]);
//                queries[i][j] = queriesItem;
//            }
//        }
//
//        long result = arrayManipulation(n, queries);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
//
