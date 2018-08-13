package Singleton;

public class Abc {
    static Abc object = new Abc();
    private Abc(){}

    public static Abc getInstance(){
        return object;
    }
    public void aaa(){
        System.out.println("aaa");
    }

}
