package com.company.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
*
*           1
          /   \
         3    3
        / \  / \
       4   5 6  7
      /
     8

r = 3-2
last =7
q=    4 5 6 7
ans =  1  3-2
*
*
* */
public class RightViewOfBinaryTree {
    public static ArrayList<Integer> solve(TreeNode<Integer> root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;

        Deque<TreeNode<Integer>> q = new ArrayDeque<>();
        q.add(root);
        TreeNode<Integer> last = root;

        while(!q.isEmpty()){
            TreeNode<Integer> r = q.pop();
            if(r.left!=null) q.add(r.left);
            if(r.right!=null) q.add(r.right);

            if(r == last ){
                list.add(r.val);
                if(!q.isEmpty()) last = q.peekLast();
            }
        }

        return list;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right= new TreeNode(7);

        List<Integer> solve = solve(root);
        System.out.println(solve);
    }
}
