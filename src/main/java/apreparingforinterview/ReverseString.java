package apreparingforinterview;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
//        Output: ["o","l","l","e","h"]

        char[] s2 = {'H','a','n','n','a','h'};
//        Output: ["h","a","n","n","a","H"]

        reverseString(s1);
        reverseString(s2);
    }



    public static void reverseString(char[] s) {
         int start = 0;
         int end = s.length-1;

         while (end > start) {
         char temp = s[start];
         s[start] = s[end];
         s[end] = temp;
         start++;
         end --;
         }

        System.out.println(Arrays.toString(s));
    }


}
