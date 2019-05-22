public class StaticDispatch {

/*    static abstract class Human {}

    static class Man extends Human {
    }

    static class Woman extends Human {}

    public void sayHello(Human guy) {
        System.out.println("hello guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("hello gentleman!");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch dispatch = new StaticDispatch();
        dispatch.sayHello(man);
        dispatch.sayHello(woman);

    }*/

    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {

        @Override
        protected void sayHello() {
            System.out.println("hello gentleman!");
        }
    }

    static class Woman extends Human {

        @Override
        protected void sayHello() {
            System.out.println("hello lady!");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();

    }

}
