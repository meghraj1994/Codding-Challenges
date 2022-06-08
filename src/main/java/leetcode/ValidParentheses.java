package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        /*
          Example 1: Input: s = "()" Output: true
          Example 2:Input: s = "()[]{}" Output: true
          Example 3:Input: s = "(]" Output: false
         */

        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";

        System.out.println(isBoolean(input1));
        System.out.println(isBoolean(input2));
        System.out.println(isBoolean(input3));

    }
    public static boolean isBoolean(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()) {
            if(c=='(' || c == '{' || c=='[') {
                stack.push(c);
            } else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if(c=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else  if(c==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
