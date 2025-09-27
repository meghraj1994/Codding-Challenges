package java8features.streamapi.createstreamapi;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStreamApi {

    public static void main(String[] args) {

        //1) creating stream from Stream.of() method
        Stream<String> names = Stream.of("Meghraj", "Sukanya", "Anjan", "soundu");

        //2) creating from Collection
        Collection<String> zones = Arrays.asList("Mechi", "Koshi", "Sagarmatha");

        //3) creating using List
        List<String> district = Arrays.asList("Bara", "Parsa", "Rautahat", "Makwanpur","Chitwan");
        district.stream().forEach(System.out::println);

         //4) creating using Set<>
        Set<String> planets = new HashSet<>(district);
        planets.stream().forEach(System.out::println);

        //5)creating using array
        int[] counts = {1,2,3,4,5,6};
        Arrays.stream(counts).forEach(System.out::println);
    }
}
