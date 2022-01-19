package com.company.Tree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public static  int isBalanced(TreeNode root) {

        if(root == null) return 1;

        int l = isBalanced(root.left);
        int r = isBalanced(root.right);

        if(Math.abs(l-r)>1)
            return 0;


        return 1;

    }
}
