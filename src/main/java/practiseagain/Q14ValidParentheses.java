package practiseagain;

import java.util.Stack;

public class Q14ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
//
        System.out.println(isValidParentheses(s1));
        System.out.println(isValidParentheses(s2));
        System.out.println(isValidParentheses(s3));
    }

    public static boolean isValidParentheses(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();

            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();

            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
