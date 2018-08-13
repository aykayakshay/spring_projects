package hacker_rank.Day9;

 class Day9 {
    public static void main(String[] args) {
        int n = 20;
        int a = 1;
        for(int i = n-1;i >0; i--)
            a *= n-i;
        System.out.println(n * a);
    }
    }


