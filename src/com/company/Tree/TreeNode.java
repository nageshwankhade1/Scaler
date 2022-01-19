package com.company.Tree;

public class TreeNode<T> {
    T val;
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode(T x) {
        val = x;
        left=null;
        right=null;
    }
}