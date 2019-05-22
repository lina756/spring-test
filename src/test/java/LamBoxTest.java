import lombok.Data;
import lombok.experimental.Delegate;

class Test1 {
    int a = 1;
    int b = 2;
}


@Data
public class LamBoxTest {

    @Delegate(types = {Test1.class})
    private Test1 test1;

    public static void main(String[] args) {

    }

}
