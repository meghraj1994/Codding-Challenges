package phase1;

import java.util.Stack;

public class M_Decode_A_String {

    public static void main(String[] args) {
        String s1 = "1[b]";          //"b"
        String s2 = "2[ab]";         // "abab"
        String s3 = "3[b2[ca]]";    // "bcacabcacabcaca"

        System.out.println(decodeAString(s1));
        System.out.println(decodeAString(s2));
        System.out.println(decodeAString(s3));
    }

    public static String decodeAString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        int count = 0;
        StringBuilder currentString = new StringBuilder();

        //case1 : check if it is a digit then store in count
        for (Character ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                strStack.push(currentString);

                //and reset these values
                count = 0;
                currentString = new StringBuilder();

            } else if (ch == ']') {

                int repeatedString = countStack.pop();    // 2
                StringBuilder decodeString = strStack.pop(); //b and currentString ="ca"
                for (int i = 0; i < repeatedString; i++) {
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
