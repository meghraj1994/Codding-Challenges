package apreparingforinterview;

import java.util.Stack;

public class DecodeAnString {
    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count =0;

        for(Character ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count*10 + (ch-'0');
            } else if (ch=='[') {
                countStack.push(count);
                strStack.push(currentString);
                count=0;
                currentString= new StringBuilder();

            } else if (ch==']') {
                int repeat = countStack.pop();
                StringBuilder decodeString = strStack.pop();
                for(int i=0;i<repeat;i++){
                    decodeString.append(currentString);
                }
                currentString = decodeString;

            } else {
                currentString.append(ch);
            }
        }


        return currentString.toString();
    }

    public static void main(String[] args) {
        String s1 = "1[b]";
        String s2 = "2[ab]";
        String s3 = "2[a2[b]]";
        String s4 = "3[b2[ca]]";

//        System.out.println(decodeString(s1)); // Output: "b"
//        System.out.println(decodeString(s2)); // Output: "abab"
//        System.out.println(decodeString(s3)); // Output: "abbabb"
        System.out.println(decodeString(s4)); // Output: "bcacabcacabcaca"
    }

}
