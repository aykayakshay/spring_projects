package InterviewTest;

public class eeerrt {
    public static void main(String[] args) {
                String first = "fcrxzwscanmligyxyvym";
                String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

                int[] lettercounts = new int[26];
                for(char c : first.toCharArray()){
                    lettercounts[c -'a']++;
                }
                for(char c : second.toCharArray()){
                    lettercounts[c-'a']--;
                }
                int result = 0;
                for(int i : lettercounts){
                    result += Math.abs(i);
                }
                System.out.println(result);


            }

        }

