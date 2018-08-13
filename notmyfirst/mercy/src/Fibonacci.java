public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];

        int sum = 0;
        a[0] =1;
        a[1] =2;
        for(int i=2;i<100; i++){
            a[i] = a[i-1] + a[i-2];
        }
        for(int i=0;i<a.length;i++){
            if(((a[i]> 0)&(a[i]%2==0)) & (a[i]< 4000000))
                sum+= a[i];
//                System.out.println(a[i]);


        }
        System.out.println(sum);


    }
    }

