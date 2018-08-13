package InterviewTest;

public class Armstrong {
    public static void main(String[] args) {

        int arm = 371;
        double count=0;
        String num = Integer.toString(arm);
        int len_num = num.length();
        for (int i = 0; i < len_num; i++){
            String str = String.valueOf(num.charAt(i));
            count += Math.pow((Integer.parseInt(str)),3);

        }
        if(count == arm)
            System.out.println("armstrong");

    }
}
