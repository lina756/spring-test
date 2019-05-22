import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class SortTest {

    private static int a = 0;

    private int i = a++;

    @Override
    public String toString() {
        return "SortTest{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        List<SortTest> testList = new ArrayList<>(3);
        testList.add(new SortTest());
        testList.add(new SortTest());
        testList.add(new SortTest());
        System.out.println(testList);
        Collections.reverse(testList);
        System.out.println(testList);
    }
}
