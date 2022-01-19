package com.company.Tree;

import java.util.Stack;

public class PostOrderTraversalWithOutRecursive {
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

            while(curr!=null){
                System.out.print(curr.val+" ");
                if(curr.right!=null){
                    stack.push(curr.right); //push to only right node of tree
                }
                curr = curr.left;
            }
            if(!stack.isEmpty()){
                curr=stack.pop();
            }

        }//end while

    }
}
