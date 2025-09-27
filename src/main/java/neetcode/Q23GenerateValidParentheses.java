package neetcode;

import java.util.ArrayList;
import java.util.List;

public class Q23GenerateValidParentheses {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        System.out.println(generateValidParentheses(n2).toString());


    }

    public static List<String> generateValidParentheses(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {

        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append("(");
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(")");
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }


    }
}
