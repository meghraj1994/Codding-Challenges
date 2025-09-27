package neetcode.practice;

import java.util.Stack;

public class Q12DecodeString {
    public static void main(String[] args) {
        String s = "1[b]";
        String s1 = "2[ab]";
        String s3 = "3d[b2[ca]]";

        System.out.println(decodeString(s));
        System.out.println(decodeString(s1));
        System.out.println(decodeString(s3));
    }

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> currentStringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count = 0;

        for (Character ch : s.toCharArray()) {
            //step 1a : check if char is digit then store in count eg s3 = 3
            if (Character.isDigit(ch)) {
                count = count * 10 + ch - '0'; // just converting to int and storing
            } else if(ch == '['){
            // Step2: as soon as we get '[' store current count and current string in stack and reset count and currentString value;
                countStack.push(count);
                currentStringStack.push(currentString);
                count = 0;
                currentString = new StringBuilder();

                //step3: when you get ']'
            } else if (ch == ']') {
                int decodeCount = countStack.pop();
                StringBuilder decodeString = currentStringStack.pop();
                for (int i = 0; i < decodeCount; i++) {
                    decodeString.append(currentString);
                }
                currentString = decodeString;

            } else {
                //step1b : else append in currentString : eg s2 : "d"
                currentString.append(ch);
            }

        }
        return currentString.toString();
    }
}
