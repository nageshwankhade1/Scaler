package com.company.Tree;

public class ValidBstTree {
    public static int isValid = 1;
    public static void main(String[] args) {

    }

    public static Pair<Integer, Integer> isValidBst(TreeNode<Integer> root){
        if(root == null) return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

        Pair<Integer, Integer> l = isValidBst(root.left);
        Pair<Integer, Integer> r = isValidBst(root.right);

        if(root.val<l.max || root.val>=r.min)
            isValid=0;

        return new Pair(Math.max(r.max, root.val), Math.min(l.min, root.val));
    }

    private static class Pair<T, T1> {
        T min;
        T max;

        public Pair(T min, T max){
            this.max = max;
            this.min = min;
        }
    }
}
