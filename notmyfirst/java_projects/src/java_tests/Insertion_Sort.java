package java_tests;

import java.util.Arrays;

public class Insertion_Sort {
    public static int[] doInsertionSort(int[] arr) {

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String a[]) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = doInsertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}




