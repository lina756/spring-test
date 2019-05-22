public class SingleTon {

    private SingleTon() {}

    public static class LazyHolder {

        private static LazyHolder lazyHolder = new LazyHolder();

        static {
            System.out.println("LazyHolder.<clinit> ");
        }

        private LazyHolder() {
            System.out.println("LazyHolder初始化");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag) return new LazyHolder[2];
        return LazyHolder.lazyHolder;
    }

    public static void main(String[] args) {
        getInstance(true);
        System.out.println("------");
        getInstance(false);
    }
}
