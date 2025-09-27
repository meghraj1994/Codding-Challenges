package phase1;

import java.util.Stack;

public class J_Valid_Parentheses {

    public static void main(String[] args) {
        String s = "()";              // true
        String s1 = "()[]{}";        //true
        String s2 = "[)";             //false

        System.out.println(isValidParentheses(s));
        System.out.println(isValidParentheses(s1));
        System.out.println(isValidParentheses(s2));
    }

    public static boolean isValidParentheses(String s) {
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
