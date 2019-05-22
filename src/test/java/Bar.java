public class Bar<T> {

    int a = 1;
    static int b = 2;

    public int sum(int c) {
        int d = 0;
        double f = 0.1;
        try {
            d = 4;
            return d + 1;
        }catch (Exception e) {
            return d + 2;
        } finally {
            System.out.println("hello world");
        }
    }

    public T test() {
        return null;
    }

    public static void main(String[] args) {
        new Bar<Integer>().sum(3);
    }

}
