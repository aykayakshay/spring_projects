package LinkedList;

public class eer {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val =2;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);

    }
}
