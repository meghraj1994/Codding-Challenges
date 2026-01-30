package aaaa;

import java.util.*;

public class GropingAnagram {
    public static void main(String[] args) {
        String arr[] = {"abcd", "dcba", "epam", "pame", "aepm"};

        /*
         * key    value
         * abcd  -> abcd, dcba
         * aemp -> epam, pame, aepm
         *
         *
         * */
        System.out.println(findGroup(arr));
        System.out.println(findGroupUsingFrequency(arr));
    }


    /*
     * timeComplexity = O(n*m*log(n))
     * space complexity = O(n*m)
     * */
    public static List<List<String>> findGroup(String[] input) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : input) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(sortedWord);
        }

        return new ArrayList<>(map.values());


    }


    /*
    * T(n) = O(n*m) => n is size of array and m is max size words
    * S(n) = O(n*m)
    * */
    public static List<List<String>> findGroupUsingFrequency(String[] input) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : input) {
            int[] count = new int[26];
            for (Character ch : word.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count.length; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);


        }
        return new ArrayList<>(map.values());
    }


}
