package com.company.recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SubSetRecursion {

    public static void main(String[] args) {

       ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

       ArrayList<Integer> A = new ArrayList<>();
       A.add(15);
        A.add(20);
        A.add(12);
        A.add(19);
        A.add(4);
        Collections.sort(A);
        generateSubSets(A, 0, new ArrayList<Integer>(), output);

        Collections.sort(output, (o1, o2) -> {
          int size = Math.min(o1.size(), o2.size());
            for(int i=0;i<size;i++){
                if (o1.get(i) == o2.get(i)){
                    continue;
                }else{
                    return o1.get(i) - o2.get(i);
                }
            }
            return o1.size()-o2.size();
        });

        System.out.println(output);
    }

    public static void generateSubSets(ArrayList<Integer> list, int index, ArrayList<Integer> subsets, ArrayList<ArrayList<Integer>> output){

        if(index == list.size()){
            output.add(subsets);
            return ;
        }

        //not included
        generateSubSets(list, index+1, new ArrayList<>(subsets), output);

        //included
        subsets.add(list.get(index));
        generateSubSets(list, index+1, new ArrayList<>(subsets), output);
        subsets.remove(list.get(index));

    }
}
