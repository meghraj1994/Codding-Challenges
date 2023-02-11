package sukanya;

public class Outer {
    int a;
    public void show() {

    }

    class Inner {
        public void display() {
            System.out.println("display");

        }
    }


    public static void main(String[] args) {
        Outer obj = new Outer();
         obj.show();
        Outer. Inner obj1= obj.new Inner();
        obj1.display();

        }


    }






