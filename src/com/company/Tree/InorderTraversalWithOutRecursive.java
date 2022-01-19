package com.company.Tree;

import java.util.Stack;

public class InorderTraversalWithOutRecursive {
    public static void main(String[] args) {
        TreeNode<Integer> treeNode = InputTree.getDummyTree();
        BTreePrinter.printNode(treeNode);
        inorderTraversal(treeNode);
    }
    public  static void inorderTraversal(TreeNode<Integer> root){
        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> curr = root;
        //stack.push(curr);
        while(curr!=null || !stack.isEmpty()){

            if(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }

            if(curr==null){
                System.out.print(stack.peek().val +" ");
                curr = stack.peek().right;
                stack.pop();
            }
        }

    }
}
