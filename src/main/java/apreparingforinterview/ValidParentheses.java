package apreparingforinterview;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {


        String s1 = "()"; //Output: true

        String s2 = "()[]{}";  // Output: true
        String s3 = "(]";   //Output: false
        String s4 = "({[)}]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

    public static boolean isValid(String s) {

        if(s.length()%2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if(c=='(' || c== '{' || c=='['){
                stack.push(c);
            } else if (c==')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            } else if (c=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else if (c==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}


