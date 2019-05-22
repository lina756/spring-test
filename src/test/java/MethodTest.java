import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Hello.class.getMethod("sayHello", int.class);
        for (int i = 0; i < 20; i++) {
            method.invoke(null, i + 1 );
        }
    }
}

class Hello {

    public static void sayHello(int i) {
        new Exception("#"+ i).printStackTrace();
    }
}