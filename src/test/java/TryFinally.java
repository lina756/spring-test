public class TryFinally {

    private static void test() {
        try {
            System.out.println("hello world");
            throw new Exception("测试1");
        }catch (Exception e ) {
            System.out.println("报错！" + e.getMessage());
        }finally {
            System.out.println("the end");
        }
    }

    public static void main(String[] args) {
        test();
    }
}
