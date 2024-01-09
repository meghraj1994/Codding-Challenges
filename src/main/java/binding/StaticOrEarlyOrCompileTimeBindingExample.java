package binding;

/*
* binding of static, final and private method happens at compile time
*
*
* */

public class StaticOrEarlyOrCompileTimeBindingExample {

    public static void main(String[] args) {
        SuperClass sup = new childClass();
        sup.dog();  // since its static method : super class dog method hides child class method

        SuperClass sup1 = new childClass();
         sup1.cat();

    }

}


abstract class SuperClass {

    public static void dog() {
        System.out.println("super : dog is barking......!!!!");
    }

    public void cat() {
        System.out.println("Super : cat says meow.....!!!!");
    }

}

class childClass extends SuperClass {

    //this is example for method hidding
    // when same static method is present in super class and child clas -> super class method hides child class method
    public static void dog() {
        System.out.println("child : dog is barking....!!!!");
    }

    // non/instance  static method
    public void cat() {
        System.out.println("child : cat says meow.....!!!!");
    }
}
