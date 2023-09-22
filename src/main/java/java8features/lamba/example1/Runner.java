package java8features.lamba.example1;

public class Runner {

    public static void main(String[] args) {

        //traditional OOPS ways :
        System.out.println("Using OOP Concept");
        Ractangle ractangle = new Ractangle();
        ractangle.draw();

        Circle circle = new Circle();
        circle.draw();
        System.out.println("---------------------------------");
        // using lambda expression :

        System.out.println("Using Lambda expression");
        Shape s = () -> System.out.println("draw a rectangle");
        s.draw();

        Shape s1 = () -> System.out.println("draw a circle........");
        s.draw();



    }



}
