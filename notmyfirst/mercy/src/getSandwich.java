public class getSandwich {

    public static String plusOut(String str, String word) {
        String s1 = str;
        int w_len = word.length();
        int s_len = str.length();

        for(int i=0;i<s_len;i++){
            for(int j=0;j<w_len;j++){
                if(w_len<2 && str.charAt(i) != word.charAt(j)){
                        str = str.replace(str.charAt(i),'+');
                }

            }
        }

        for(int i=0;i<s_len;i++){
            for(int j=0;j<w_len;j++){
                if(w_len>=2 && s1.charAt(i) == word.charAt(j)){
                    str = str.replace(str.charAt(i),s1.charAt(i));
                    break;
                }
                if(w_len>=2 && str.charAt(i) != word.charAt(j)){
                    str = str.replace(str.charAt(i),'+');
                }


            }
        }
        return str;


    }



    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));


    }
}
