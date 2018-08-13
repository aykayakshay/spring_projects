public class SumSqDiff {
    public static void main(String[] args) {
        int sum = 0;
        int b=0;
        for (int i=1; i< 101;i++){
            sum += i*i;
            b += i;

        }
        System.out.println((b*b) - sum);
    }
}
