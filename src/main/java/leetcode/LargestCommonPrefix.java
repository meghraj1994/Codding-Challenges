package leetcode;

public class LargestCommonPrefix {
    public static void main(String[] args) {

        String[] str1 = {"flower", "flow", "flight"}; //output="fl"
        String[] str2 = {"dog", "racecar", "car"};    //output=""

        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));

    }

    public static String longestCommonPrefix(String[] str) {

        if (str.length == 0) return "";
        String newString = str[0];          //newString = "flower"

        for (int i = 1; i < str.length; i++) {
            int p = 0;
            while (p < newString.length() && p < str[i].length() && newString.charAt(p) == str[i].charAt(p)) {
                p++;
            }
            if (p == 0) return "";
            newString = newString.substring(0, p);
        }

        return newString;
    }
}
