package InterviewTest;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
        int arr_removed[] = new int[n];
        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr_removed[j] += arr[i];
                j++;
            }
        }
        arr_removed[j] += arr[n-1];
        for(int i=0;i<j+1;i++)
            System.out.print(arr_removed[i] + " ");

    }
}

