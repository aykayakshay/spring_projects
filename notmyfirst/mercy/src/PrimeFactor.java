public class PrimeFactor {
    public static void main(String[] args) {
        long n = 600851475143L;
        long aa = 0L;
//        long n = 64;


        for(long i=n-1;i>0;i--){
            if(n%i ==0){
                n=n/i;
                aa = i;



            }
        }
        System.out.println(aa);
//
//
//
//        }
//        long x = 600851475143L;
//        long biggest = 0L;
//        for (long i = 2L; i <= x; i++) {
//            for (long l = 1L; l <= Math.sqrt(i); l++) {
//                if (l % i == 0) {
//                    break;
//                } else {
//                    while (x % i == 0) {
//                        x = x / i;
//                        biggest = i;
//                    }
//                }
//            }
//        }
//        System.out.println(biggest);

    }
}
