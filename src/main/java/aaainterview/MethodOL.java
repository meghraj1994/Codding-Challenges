package aaainterview;


class A {

    public void run() {
        System.out.println("A method");
    }

    public static void laugh(){
        System.out.println("A's laughing");
    }
}

class B extends A {

    public void run() {
        System.out.println("B method");
    }

    public static void laugh(){
        System.out.println("B's laughing");
    }
}

public class MethodOL {

    public static void main(String[] args) {
        A a= new A();
        a.run();      // a's method
        a.laugh();
        B b = new B();
        b.run();        //b's method
        b.laugh();
        A a1 = new B();
        a1.run();
        a1.laugh();
        // a's method
        //at compile time it thinks a's method but at run time it excute b's method
    }
}
