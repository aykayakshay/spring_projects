package LinkedList;

import java.io.IOException;
import java.util.Scanner;

public class eeeeerr {
    static long arrayManipulation(int n, int[][] queries) {
        int k = 1;
        int max = 0;
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < queries.length; i++) {
            for (int p = 0; p < (queries[i][1]); p++) {
                a[(queries[i][0]) - k + p] += queries[i][2];
                sum += a[((queries[i][0]) - k) + p];
                if (sum > max) {
                    max = sum;

                }


            }
        }
        return max;


    }

    private static final Scanner scanner = new Scanner(System.in);
//
    public static void main(String[] args) throws IOException {


        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);



        scanner.close();
    }
}

