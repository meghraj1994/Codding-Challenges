package blind75.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailPass {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> fruits = new CopyOnWriteArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()){
            String fruit = iterator.next();
            if(fruit.equals("Mango")){
                fruits.remove(fruit);
            }
        }

    }
}
