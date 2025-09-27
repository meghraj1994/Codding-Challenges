package aaaaaaaaa.FirstNonRepeatedCharacter;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Given a string, find the first character that does not repeat.
* String s = "troubleShooter", output = u
* */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String s = "troubleShooter";

         Character ch = s.chars()
                 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue()==1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .orElse(null);

        System.out.println(ch);



    }


}
