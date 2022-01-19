package com.company.Tree;

import java.util.TreeMap;

public class InputTree {

    public static TreeNode<Integer> getDummyTree(){
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right= new TreeNode(7);

        return root;
    }
}
