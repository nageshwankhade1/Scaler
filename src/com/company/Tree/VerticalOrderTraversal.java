package com.company.Tree;

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        root.right.right= new TreeNode(6);

        System.out.println(verticalOrderTraversal(root));


    }
    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode<Integer> root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Deque<NodeWithPos> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        if(root==null) return res;

        q.add(new NodeWithPos(0, root));
        while (!q.isEmpty()){
            NodeWithPos node= q.pop();

            if(map.containsKey(node.getPos())){
                ArrayList<Integer> list = map.get(node.getPos());
                list.add(node.getNode().val);
                map.put(node.getPos(), list);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(node.getNode().val);
                map.put(node.getPos(), list);
            }

            if(node.getNode().left!=null) q.add(new NodeWithPos(node.getPos()-1, node.getNode().left));
            if(node.getNode().right!=null) q.add(new NodeWithPos(node.getPos()+1, node.getNode().right));

        }
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
            minX = Math.min(minX, entry.getKey());
            maxY = Math.max(maxY, entry.getKey());
        }

        for(int i=minX;i<=maxY;i++){
                ArrayList<Integer> list = map.get(i);
                res.add(list);
        }

        return res;
    }
}

class NodeWithPos{
    int pos;
    TreeNode<Integer> node;

    public NodeWithPos(int p, TreeNode<Integer> node){
        this.pos = p;
        this.node = node;
    }

    public int getPos() {
        return pos;
    }

    public TreeNode<Integer> getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "NodeWithPos{" +
                "pos=" + pos +
                ", node=" + node +
                '}';
    }
}


