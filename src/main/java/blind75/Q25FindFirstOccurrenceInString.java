package blind75;

public class Q25FindFirstOccurrenceInString {

    public static void main(String[] args) {
        String heyStack = "sadbutsad";
        String needle = "sad";       //output : 0

        String heyStack1 = "leetcode";
        String needle1 = "leeto";       //output =-1 , since no occurrence found

        System.out.println(findFirstOccurrenceInString(heyStack, needle));
        System.out.println(findFirstOccurrenceInString(heyStack1, needle1));
    }


    public static int findFirstOccurrenceInString(String heyStack, String needle) {


        int p1 = 0;
        int p2 = 0;

        while (p1 < heyStack.length() && p2 < needle.length()) {
            if (heyStack.charAt(p1) == needle.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1 = p1-p2+1;
                p2=0;
            }
        }
        if(p2==needle.length()) return p1-p2;
        return -1;

    }
}
