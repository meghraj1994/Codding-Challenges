package leetcode;

public class LengthOfLastWord {
    /*
     * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5.
     *Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word is "moon" with length 4.
     *Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is "joyboy" with length 6.
     */

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int counter = 0;
        char[] c = s.toCharArray();

        for (int i = c.length - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                break;
            }
            counter++;
        }
        return counter;
    }
}
