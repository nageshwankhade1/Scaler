package com.company.array;

/**
 *MaxMod
 * Problem Description
 *
 * Given an array A of size N, groot wants you to pick 2 indices i and j such that
 *
 * 1 <= i, j <= N
 * A[i] % A[j] is maximum among all possible pairs of (i, j).
 * Help Groot in finding the maximum value of A[i] % A[j] for some i, j.
 *
 *Input 1:
 *  A = [1, 2, 44, 3]
 *
 * Input 2:
 *  A = [2, 6, 4]
 *
 *
 * Example Output
 * Output 1:
 *  3
 *
 * Output 2:
 *  4
 *
 *
 */
public class MaxMod {

    public static void main(String[] args) {
        int arr[] = {1,2,44,3};
        System.out.println(solve(arr));
    }
    public static int solve(int[] A) {
        int f = 0;
        int s = 0;
        int j = 1;
        // 927, 707, 374, 394, 279, 799, 878, 937, 431, 112
        // 683, 354, 95, 937, 78, 246, 319, 516, 913, 112
        // 1, 2, 3, 3
        for(int i=0;i<A.length && j<A.length;i++){
            if( A[i]>f){
                s=f;
                f=A[i];
            }else if(s<A[i] && f!=A[i]){
                s = A[i];
            }

        }

        //System.out.println("F::"+f);
        //System.out.println("S::"+s);
        if(s==0)
            return 0;
        if(f%s > s%f)
            return f%s;
        else
            return s%f;
        //return 0;
    }
}

