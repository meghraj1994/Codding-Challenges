package aaaaaaaaa;

import java.util.*;

public class FindGroup {

//    String arr[] = {"abcd","dcba","epam","pame","aepm"}
//    "abcd", "abcd" , aepm, "aepm"
//    Output = [epam,pame,aepm]

    /*
     * abcd  : [abcd : [abcd,dcba]
     * aepm : [aepm : aepm,pame,epam]
     *
     * */


    public static void main(String[] args) {
        String arr[] = {"abcd", "dcba", "epam", "pame", "aepm"};


        List<List<String>> group = findGroup(arr);

        for (List<String> word : group) {
            System.out.println(word);
        }

    }


    public static List<List<String>> findGroup(String[] input) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : input) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);

        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> value : map.values())
            result.add(value);

        return result;

    }


}
