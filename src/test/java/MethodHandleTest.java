import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {

    static class ClassA {
        public void println(String value) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        try {
            getPrintlnMH(obj).invoke("hello world");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static MethodHandle getPrintlnMH(Object receiver) throws NoSuchMethodException, IllegalAccessException {
        MethodType mt = MethodType.methodType(void.class, String.class);
        return MethodHandles.lookup().findVirtual(receiver.getClass(), "println", mt).bindTo(receiver);
    }
}
