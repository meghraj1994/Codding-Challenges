package sukanya.codingd;

import java.util.ArrayList;
import java.util.List;

public class Sarcn {

    public static void main(String[] args) {
        System.out.println(isSarcNation("china"));
    }

    static boolean isSarcNation(String givenCountry) {

        List<String> sarcCountries = new ArrayList<>();
        sarcCountries.add("India");
        sarcCountries.add("Srilanka");
        sarcCountries.add("Nepal");
        sarcCountries.add("Pakistan");
        sarcCountries.add("Bhutan");
        sarcCountries.add("BD");
        sarcCountries.add("Afgan");
        sarcCountries.add("Maldies");

        if (sarcCountries.contains(givenCountry)) {
            return true;
        } else {
            return false;
        }


    }


}
