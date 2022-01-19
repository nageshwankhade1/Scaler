package com.company.recursion;

import java.util.ArrayList;

public class PurmuteInteger {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       solve(list, new ArrayList<>(), res);

        System.out.println(res);
    }
    public static  void solve(ArrayList<Integer> list, ArrayList<Integer> output, ArrayList<ArrayList<Integer>> res){

        if(list.size()==0){
            res.add(output);
            return;
        }

        for(int i=0;i<list.size(); i++){

            output.add(list.get(i));

            solve(updatedList(list, list.get(i)), new ArrayList<Integer>(output), res);
            output.remove(list.get(i));

        }

    }

    public static ArrayList<Integer> updatedList(ArrayList<Integer> list, int value){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(int i=0;i<list.size(); i++){
            if(list.get(i)!=value){
                newList.add(list.get(i));
            }

        }

        return newList;
    }
}
