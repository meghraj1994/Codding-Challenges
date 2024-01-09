package binding;

public class LateOrDynamicOrRuntimeBinding {
    public static void main(String[] args) {

      A a = new A();
      a.m1();

    }
}

class A {
      public void m1() {
          System.out.println("super :  m1()");
      }
}

class  B extends A {

    @Override
    public void m1() {
        System.out.println("child :  m1()");
    }

}
