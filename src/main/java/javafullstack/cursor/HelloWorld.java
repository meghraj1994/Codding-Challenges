package javafullstack.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add("Meghraj");
        list.add("Sukanya");

//        System.out.println(list);   // output : [10, Meghraj, Sukanya]

        Iterator it= list.iterator();;

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
