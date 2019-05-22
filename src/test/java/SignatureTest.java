import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignatureTest {

    public static void test() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list);
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>(16);
        map.put("lina", "java");
        map.put("sisi", "php");
        System.out.println(map.get("lina"));

    }

}
