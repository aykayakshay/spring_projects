public class countHi {
    public static void main(String[] args) {
        String str = "abc hi ho";
        str = "x" + "x";
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("hi")){
                count++;

            }
        }
        System.out.println(count);
    }
}
