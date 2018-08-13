public class maxBlock {
    public static void main(String[] args) {
        String str = "abbCCCddBBBxx";
        int count=0;
        int count1=1;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length()-1;j++){
                if(str.charAt(i) == str.charAt(j))
                    count1++;
            }
            if(count1>count)
                count = count1;
            count1=1;
        }
    }
}
