package java8features.doubt;

public class A implements Runner {

    @Override
    public void run() {
        System.out.println("running from A");
    }

    public A() {
    }

    public A(B b) {
     super();
    }
}
