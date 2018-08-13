public class WithoutString {
    public static void main(String[] args) {
        String base = "hello there";
        String remove = "llo";
        String result = "";
        int index = base.toLowerCase().indexOf(remove.toLowerCase());
        while (index != -1) {
            result += base.substring(0, index);
            base = base.substring(index + remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        result += base;
        System.out.println(result);

    }
    }