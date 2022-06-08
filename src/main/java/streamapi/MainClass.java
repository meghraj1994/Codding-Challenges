package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14);

       List<Integer> evenList = list.stream()
                                          .filter(num->num%2==0)
                                          .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
