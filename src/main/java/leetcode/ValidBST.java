package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidBST {

    public static void main(String[] args) {



    }

    public static boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack();

        double left_child_value = -Double.MAX_VALUE;

        while (!stack.empty() && root != null) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= left_child_value) return false;
            left_child_value = root.val;
            root = root.right;


        }
        return false;

    }
}


//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


