class ConstantClass {
    static {
        System.out.println("ConstantClass static init");
    }

    public static final String HELLO_WORLD = "hello world";
}
public class NotInitiallization {
    public static void main(String[] args) {
        System.out.println(ConstantClass.HELLO_WORLD);
    }
}
