package java8features;




interface Shape {
    void draw();     //in interface if an un-implemented method is by default public and abstract
}





public class LambdaExpressionExample {

    public static void main(String[] args) {

        Shape rectangle = () -> System.out.println("Draw a cicle");
        rectangle.draw();


    }

}
