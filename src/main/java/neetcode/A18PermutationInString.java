package neetcode;

public class A18PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        String s3 = "ab";
        String s4 = "eidboaoo";

        System.out.println(checkInclusion(s1, s2)); //true
        System.out.println(checkInclusion(s3, s4)); //false


    }

    public static boolean checkInclusion(String s1, String s2) {

        //step : store both string to 2 different frequency map
        /*
         *  s1Map :
         * a-1
         * b-2
         *
         * s2Map : making as window as same length as s1Map
         * e--1; //
         * i--i //
         * d=1; //
         * b=1
         * a=1 //this is same as s1 frequency map means permutation is true
         *
         *
         * */

        //step1 : check some edge cases
        if (s1.length() > s2.length()) {
            return false;
        }

        //step:2 making frequency map for s1 and window for s2
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        //step3 : initiate s1Map and intial window for s2Map
        for (int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            //step3: check if at any pont both frquency map same
            if (matches(s1Map, s2Map)) {
                return true;
            }
            s2Map[s2.charAt(i + s1.length()) - 'a']++; //adding new char to window
            s2Map[s2.charAt(i) - 'a']--; //removing char from window

        }
        //this is for last window
        return matches(s1Map, s2Map);
    }

    private static boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < s1Map.length; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
}
