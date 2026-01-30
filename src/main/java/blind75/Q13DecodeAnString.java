package blind75;

import java.util.Stack;

public class Q13DecodeAnString {

    public static void main(String[] args) {
        String input = "1[b]"; // "b"
        String input2="2[ab]";  // "abab"
        String input3="3[b2[ca]]"; //"bcacabcacabcaca"

        System.out.println(deCodeAnString(input));
        System.out.println(deCodeAnString(input2));
        System.out.println(deCodeAnString(input3));
    }


    /*
    * 1ab[2ab]
    *
    * */



    public static String deCodeAnString(String input){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int count=0;

        for(Character ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                count = count*10+ (ch-'0');
            } else if (ch == '[') {
                countStack.push(count);
                strStack.push(currentString);
                count=0;
                currentString= new StringBuilder();
            } else if (ch==']') {
                int repeatedString = countStack.pop();
                StringBuilder decodeString = strStack.pop();

                for(int i=0; i<repeatedString; i++){
                    decodeString.append(currentString);
                }
                currentString=decodeString;
            } else {
                currentString.append(ch);
            }
        }


        return currentString.toString();
    }
}
