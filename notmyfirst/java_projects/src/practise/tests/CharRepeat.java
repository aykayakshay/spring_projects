package practise.tests;

//Given String =”aaaaabbbccccdddddeeefff”
//        You have a to return a string like this
//        a5b3c4d4e3f3-  like character and how many times it is repeating.

public class CharRepeat {
    public static void main(String[] args) {
        String a = "aaaaabbbccccdddddeeefff";
        int count = 0;
        for(int i = 0; i < a.length()-1; i++){
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(i) == a.charAt(j)){
                    count++;
                }
            }
            System.out.print(a.charAt(i) + "" + count);
            String d = String.valueOf(a.charAt(i)).trim();
            a = a.replaceAll(d,"");
            count = 0;
        }
    }
}
