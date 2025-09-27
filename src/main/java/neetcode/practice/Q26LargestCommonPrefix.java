package neetcode.practice;

public class Q26LargestCommonPrefix {
    public static void main(String[] args) {

        String[] input1 = {"flower", "flow", "flight"};   //output = "fl"
        String[] input2 = {"dog", "racecar", "car"};   //output="";

        System.out.println(findLargestCommonPrefix(input1));
        System.out.println(findLargestCommonPrefix(input2));
    }

    public static String findLargestCommonPrefix(String[] input) {
        if (input.length == 1) {
            return input[0];
        }

        int firstStringLength = input[0].length();
        for (int i = 1; i < input.length; i++) {
            int p1 = 0;
            while (p1 < firstStringLength && p1 < input[i].length() && input[0].charAt(p1) == input[i].charAt(p1)) {
                p1++;
            }
            firstStringLength = p1;
            if (p1 == 0) {
                return "";
            }
        }

        return input[0].substring(0, firstStringLength);
    }
}
