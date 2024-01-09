package apreparingforinterview.comparableAndcomparator;

import java.util.*;

public class ComparableAndComparatorDemo {

    public static void main(String[] args) {

        List<Laptop>  laptops = new ArrayList<>();
        laptops.add(new Laptop("apple",8,1200));
        laptops.add(new Laptop("Dell",16,900));
        laptops.add(new Laptop("Lenova",4,200));

        //2nd way using comparator

        Comparator<Laptop> comparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else {
                    return  -1;
                }
            }
        };

        Collections.sort(laptops,comparator);

//        Collections.sort(laptops, Collections.reverseOrder());



        for(Laptop l : laptops) {
            System.out.println(l);
        }

    }
}
