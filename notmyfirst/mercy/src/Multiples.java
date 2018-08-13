public class Multiples {
    public static void main(String[] args) {
        int sum = 0;
        int a =0;
        int n = 0;
        while(n<1000){
            if( n%3 ==0 || n%5 ==0){
                sum = sum + n;
                n++;
            }
            else {
                a = a + n;
                n++;
            }
        }
        System.out.println(sum);
    }
}
