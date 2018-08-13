public class gHappy {
    public static void main(String[] args) {
        String str = "xxggxx";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) == 'g') && (str.charAt(i+1) == 'g'))
                System.out.println( true);
            System.out.println(false);

        }
    }
}
