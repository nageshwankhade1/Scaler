package com.company.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sum of adjacent elements is always even
 * Given an array of integers A, find and return the minimum elements to be removed such that in the resulting array the sum of any two adjacent values is even.
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     2
 *
 * Input 2:
 *     A = [5, 17, 100, 11]
 * Output 2:
 *     1
 */

public class Program2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,11,5,7));
        System.out.println(solve(list));
    }
    public static int solve(ArrayList<Integer> A) {

        int odd =0;
        int even=0;

        for(Integer num : A){
            if(num%2==0)
                even++;
            else
                odd++;

        }

        if(even<odd)
            return even;
        else
            return odd;
    }
}
