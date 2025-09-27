package neetcode.practice;

public class Q25FindTheIndexOfFirstOccurenceOfString {

    public static void main(String[] args) {
        String heyStack0 = "sadbutsade";    //output=6
        String needle0 = "sade";

        String heyStack1 = "sadbutsade";    //output=0
        String needle1 = "sad";

        String heyStack2 = "leetcode";    //output=-1
        String needle2 = "letto";

        System.out.println(findIndexOfFirstOccuranceOfString(heyStack0, needle0));
        System.out.println(findIndexOfFirstOccuranceOfString(heyStack1, needle1));
        System.out.println(findIndexOfFirstOccuranceOfString(heyStack2, needle2));
    }

    public static int findIndexOfFirstOccuranceOfString(String heyStack, String needle) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < heyStack.length() && p2 < needle.length()) {
            if (p1<heyStack.length() && p2<needle.length() && heyStack.charAt(p1) == needle.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1 = p1 - p2 + 1;
                p2 = 0;
            }
        }
        if (p2 == needle.length()) {
            return p1 - p2;
        }
        return -1;
    }
}
