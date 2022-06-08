package functionalprogramming;

import java.awt.print.Book;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       doSomething(1,2,(result)->{
           System.out.println(result);
       });



       doCalculation(1,2,(a,b)->{
           System.out.println(a+b);
           return a;
       });


        Basket basket = new Basket();
        basket.addItem(new MyBook("Ramayan"));
        basket.addItem(new MyBook("Mahabharat"));
        basket.addItem(new MyBook("Gita"));
        basket.addItem(new Pen("Star Line"));
        basket.addItem(new Pen("Pin ton"));
        basket.addItem(new Pen("Max Writer"));

        basket.getItemList().forEach(System.out::println);



    }

    public  static void doSomething(int a, int b, MyCall callback){

        callback.apply(a+b);

    }

    public static int doCalculation(int a, float b, BiFunction<Integer,Integer,Float> callback) {
        return callback.apply(a,b);
    }
}
