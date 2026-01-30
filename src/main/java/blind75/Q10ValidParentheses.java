package blind75;

import java.util.Stack;

public class Q10ValidParentheses {

    public static void main(String[] args) {
        String s = "()"; //true
        String s1 = "()[]{}"; //true
        String s2 = "(]"; //false
        System.out.println(isValidParentheses(s));
        System.out.println(isValidParentheses(s1));
        System.out.println(isValidParentheses(s2));
    }

    public static boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(ch=='('|| ch=='{' || ch=='[') {
              stack.push(ch);
            } else if (ch==')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();

            } else if (ch=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else if (ch==']' && !stack.isEmpty()&& stack.peek()=='['){
                stack.pop();
            } else {
                stack.push(ch);
            }

        }

        return stack.isEmpty();



    }
}
