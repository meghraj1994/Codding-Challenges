package java8features.streamapi.filterinstreamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP", 500));
        productList.add(new Product(2, "Dell", 600));
        productList.add(new Product(3, "Lenova", 350));
        productList.add(new Product(4, "MacBook", 1200));
        productList.add(new Product(5, "NoteBook", 750));


        productList.stream()
                .filter((product -> product.getPrice() > 500))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
