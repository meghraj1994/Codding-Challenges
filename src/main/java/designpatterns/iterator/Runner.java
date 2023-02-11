package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<String>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        Iterator<String> iterator = alphabet.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("c"))
                iterator.remove();
        }

        //way 1
//        iterator = alphabet.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toUpperCase());
//        }

        alphabet.removeIf(a->a.equals("c"));
        alphabet.forEach(l-> System.out.println(l));

    }
}
