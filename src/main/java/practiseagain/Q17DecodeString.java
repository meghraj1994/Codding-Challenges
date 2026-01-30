package practiseagain;

import java.util.Stack;

public class Q17DecodeString {
    public static void main(String[] args) {
        String s1 = "1[b]";     // "b"
        String s2 = "2[ab]";    // "abab"
        String s3 = "3[b2[ca]]"; // "bcaca bcaca bcaca"

        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        int count = 0;
        StringBuilder currentString = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                strStack.push(currentString);
                count = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                int repeatString = countStack.pop();
                StringBuilder decodeString = strStack.pop();

                for (int i = 0; i < repeatString; i++) {
                    decodeString.append(currentString);
                }
                currentString = decodeString;

            } else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}
