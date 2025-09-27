package neetcode;

public class A2ValidAnagram {
    public static void main(String[] args) {

        String s1 = "cat";
        String t1 = "tac";

        String s2 = "ram";
        String t2 = "rat";

        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }

    public static boolean isAnagram(String s, String t) {

        //key to solve :  to be valid anagram both string should has sam letter with same frequency
        // ie  for example 1 :  c ->1 , a->1 and t -> 1 in both string


        //step 1 : check if both string has same length then only they can be valid anagram
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; //making for 26 letters of english
        //step 2 : for each char of s make increase 1 and for each char of t decrease 1
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;    //gives index of each letter of s array
            count[t.charAt(i) - 'a']--;     // so for each char of s letter we are increasing by and 1 and
            // and for t decreasing by 1
        }

        //step 3 : check if all letter are zero then it valid anagram
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
