package com.company.Tree;

import java.util.ArrayList;

public class InorderTraversalRecursive {
    public static void main(String[] args) {
        TreeNode<Integer> treeNode = InputTree.getDummyTree();
        BTreePrinter.printNode(treeNode);
        inorderTraversal(treeNode);
    }
    public  static void inorderTraversal(TreeNode<Integer> root){

        if(root==null) return;

        inorderTraversal(root.left);
        System.out.print(root.val +" ");
        inorderTraversal(root.right);

    }
}
