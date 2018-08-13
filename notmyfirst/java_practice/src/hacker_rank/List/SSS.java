package hacker_rank.List;

public class SSS {
    public static void main(String[] args) {
        String input = "{}[";
        while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        System.out.println(input.isEmpty());
        int max = Integer.MIN_VALUE;
        System.out.println(max);
    }
}
