package java8features.doubt;

public class Application {
    public static void main(String[] args) {

        B b = new B();
        A a = new A(b);
        a.run();
    }
}
