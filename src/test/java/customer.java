// Run with: java -XX:CompileCommand='dontinline,*. 出境' 乘客
public abstract class customer {
    abstract void go ();
    public static void main(String[] args) {
        customer a = new china ();
        customer b = new other ();
        long current = System.currentTimeMillis();
        for (int i = 1; i <= 2_000_000_000; i++) {
            if (i % 100_000_000 == 0) {
                long temp = System.currentTimeMillis();
                System.out.println(temp - current);
                current = temp;
            }
            customer c = (i < 1_000_000_000) ? a : b;
            c. go ();
        }
    }
}
class china extends customer { @Override void go () {} }
class other extends customer { @Override void go () {} }
