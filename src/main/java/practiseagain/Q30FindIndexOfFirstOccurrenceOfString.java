package practiseagain;

public class Q30FindIndexOfFirstOccurrenceOfString {
    public static void main(String[] args) {
        String heyStack = "sadbutsad";
        String needle = "sad";           // output = 0th index

        String heyStack1 = "leetcode";
        String needle1 = "leeto";        //output =-1

        System.out.println(findFirstOccurrenceIndex(heyStack, needle));
        System.out.println(findFirstOccurrenceIndex(heyStack1, needle1));
    }

    public static int findFirstOccurrenceIndex(String s, String t) {

        int p1 = 0;
        int p2 = 0;

        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1 = p1 - p2 + 1;
                p2 = 0;
            }

            if (p2 == t.length()) {
                return p1 - p2;
            }
        }
        return -1;
    }
}
