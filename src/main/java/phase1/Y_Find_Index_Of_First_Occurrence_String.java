package phase1;

public class Y_Find_Index_Of_First_Occurrence_String {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";             //output =0;


        String haystack1 = "leetcode";
        String needle1 = "leeto";       //output =-1  since there is no occurrence of string

        System.out.println(findIndexOccurrence(haystack, needle));
        System.out.println(findIndexOccurrence(haystack1, needle1));
    }

    public static int findIndexOccurrence(String haystack, String needle) {

        int p1 = 0;
        int p2 = 0;

        char[] hchar = haystack.toCharArray();
        char[] nchar = needle.toCharArray();

        while (p1 < hchar.length && p2 < nchar.length) {
            if (hchar[p1] == nchar[p2]) {
                p1++;
                p2++;
            } else {
                p1 = p1 - p2 + 1;
                p2 = 0;
            }
        }

        if (p2 == nchar.length) return p1 - p2;


        return -1;
    }
}

