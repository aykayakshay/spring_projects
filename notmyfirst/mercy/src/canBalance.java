public class canBalance {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 1};
        int len_nums = nums.length;
        int sum = 0;
        int a = 0 ;
        int sum1 = 1;
        int sum2=0;
        for(int i= sum1; i<len_nums; i++){
            sum += nums[i];
        }
        sum1++;
        sum2 += nums[a];
        if(sum2 == sum){
            System.out.println(true);
        }
        else
            System.out.println(false);
        a++;
    }
}
