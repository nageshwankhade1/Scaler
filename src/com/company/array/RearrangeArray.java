package com.company.array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
//4, 0, 2, 1, 3
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(0);
        A.add(2);
        A.add(1);
        A.add(3);
        System.out.println(A);
        int n = A.size();
        for(int i=0;i<n;i++){
            //a[i] = a[i]+(a[a[i]]%n)*n;
            int val =A.get(i)+((A.get(A.get(i)))%n)*n;
            A.set(i,val);
        }
        for(int i=0;i<n;i++){
            A.set(i,A.get(i)/n);
        }
        System.out.println(A);
    }

}
