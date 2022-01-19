package com.company.Tree;

public class ConstructBalancedBST {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 8, 10, 15, 18, 20};

        TreeNode<Integer> balBst = buildBalBst(a, 0, a.length - 1);
        BTreePrinter.printNode(balBst);

    }

    public static  TreeNode<Integer> buildBalBst(int a[], int st, int end){

        if(st>end) return  null;

        int mid = (st+end)/2;

        TreeNode<Integer> root = new TreeNode<>(a[mid]);

        root.left = buildBalBst(a, st, mid-1);
        root.right = buildBalBst(a, mid+1, end);

        return root;

    }
}
