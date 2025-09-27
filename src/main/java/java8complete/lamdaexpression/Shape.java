package java8complete.lamdaexpression;

import designpatterns.abstractfactory.Square;
import java8features.lamba.example1.Circle;

@FunctionalInterface
public interface Shape {

    void draw();
}


@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}


//class Rectangle implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle : draw() method called");
//    }
//}


//class Square implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Square : draw() method called");
//    }
//}
//
//
//class Circle implements Shape {
//
//    @Override
//    public void draw() {
//        System.out.println("Circle : draw() method called");
//    }
//}



class Main {

    public static void main(String[] args) {




//        System.out.println("-----------without Lamda expression...................");
//        //1) rectangle
//        Shape shape = new Rectangle();
//        shape.draw();
//
//        //1) rectangle
//        Shape shape1 = new Square();
//        shape1.draw();
//
//        //1) rectangle
//        Shape shape2 = new Circle();
//        shape2.draw();


        System.out.println("-----------with Lamda expression...................");


        Shape shape = ()-> System.out.println("Rectangle : draw() method called");
//        print(shape);
         print(()-> System.out.println("Rectangle : draw() method called"));


//        shape.draw();
//        Shape shape1 = ()-> System.out.println("Circle : draw() method called");
//        shape1.draw();
//        Shape shape2 = ()-> System.out.println("Square : draw() method called");
//        shape2.draw();






    }

    private static void  print(Shape sh) {
        sh.draw();
    }
}
