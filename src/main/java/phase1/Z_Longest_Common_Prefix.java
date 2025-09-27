package phase1;

public class Z_Longest_Common_Prefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String[] str1 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));
    }

    public static String longestCommonPrefix(String[] s) {

        if (s.length == 0) return "";

        String newString = s[0];

        for (int i = 1; i < s.length; i++) {
            int p = 0;

            while (p < newString.length() && p < s[i].length() && newString.charAt(p) == s[i].charAt(p)) {
                p++;
            }
            if (p == 0) return "empty";
            newString = newString.substring(0, p);
        }
        return newString;
    }
}
