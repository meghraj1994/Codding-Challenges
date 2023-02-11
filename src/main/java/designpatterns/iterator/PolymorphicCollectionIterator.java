package designpatterns.iterator;

import java.util.*;

public class PolymorphicCollectionIterator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<String> names = Arrays.asList("Meghraj","Sukanya","Anwesha","Anjan");

        printCollection(numbers);
        printCollection(names);
    }






    public static void printCollection(Collection<?> collection){
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}
