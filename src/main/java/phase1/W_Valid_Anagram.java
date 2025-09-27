package phase1;

import java.util.Arrays;

public class W_Valid_Anagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        String s3 = "rate";
        String s4 = "car";

        System.out.println(isValidAnagram(s1, s2));
        System.out.println(isValidAnagram(s3, s4));
    }

    public static boolean isValidAnagram(String s, String t) {

        String s1 = s.replaceAll("\\s", "").toLowerCase();
        String t1= t.replaceAll("\\s","").toLowerCase();

        char[] sCharArray = s1.toCharArray();
        char[] tCharArray = t1.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);


    }
}
