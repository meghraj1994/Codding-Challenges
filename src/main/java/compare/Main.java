package compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Laptop> laptops = Arrays.asList(
                new Laptop("apple", 8, 1200),
                new Laptop("Dell", 16, 900),
                new Laptop("Lenova", 4, 200)
        );

//        Collections.sort(laptops);
//
//        for (Laptop l : laptops) {
//            System.out.println(l);
//        }

//        laptops.stream()
//                .sorted(Comparator.comparingInt((Laptop l)->l.getRam()))
//                .forEach(System.out::println);


        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getRam() > o2.getRam()) {
                    return 1;
                }
                return -1;
            }
        };

        laptops.stream().forEach(System.out::println);

    }
}
