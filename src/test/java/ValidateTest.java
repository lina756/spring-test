public class ValidateTest {

    private static volatile int i = 0;

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        ValidateTest.i = i;
    }

    public static void main(String[] args) {
        Runnable run1 = () -> setI(1);

        Runnable run2 = () -> System.out.println(getI());

        Thread t1 = new Thread(run1);
        t1.start();
        Thread t2 = new Thread(run2);
        t2.start();
    }

}
