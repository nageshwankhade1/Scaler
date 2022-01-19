package com.company.recursion;

import java.util.ArrayList;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int n=3;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        shift(n, 1,2,3,res);
        System.out.println(res);
    }

    private static void shift(int n, int a, int b, int c, ArrayList<ArrayList<Integer>> res) {
        if(n==0){
            return;
        }
        shift(n-1, a,c,b,res);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);
        temp.add(a);
        temp.add(c);
        res.add(temp);
        shift(n-1, b,a,c,res);
    }
}
