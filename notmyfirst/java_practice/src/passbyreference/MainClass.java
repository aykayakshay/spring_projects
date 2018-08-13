package passbyreference;

public class MainClass {
    public static void main(String[] args) {
        int a = 2;
        PassbyvalueClass bb = new PassbyvalueClass();
        int c = bb.passby(a);
        System.out.println(a);
        System.out.println(c);

    }

}
