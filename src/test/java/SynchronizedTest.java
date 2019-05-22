import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynchronizedTest {

    public void test() {
        synchronized (this) {
            System.out.println("hello world");
        }
    }

    public static void main(String[] args) {
        BigDecimal fixShipping = new BigDecimal(2).divide(BigDecimal.valueOf(100), 3, RoundingMode.CEILING);
        System.out.println(fixShipping);
    }

}
