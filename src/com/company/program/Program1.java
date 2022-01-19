package com.company.program;

import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
       //int arr[] = new int[]{10,2,15,5};
        //int arr[] = new int[]{1,10,6,15};
        //int arr[] = new int[]{1,3,4,15};
        int arr[] = new int[]{-1,3,5,8};
       int sum = 7;

       findSumOfTwoDigit2(arr, sum);
    }

    /*private static void findSumOfTwoDigit(int[] arr, int sum) {

        int tempSum =sum;
        int fisrtDigit = 0;
        int secondDigit = 0;
        for (int i = 0; i < arr.length; i++) {

            if(tempSum<arr[i])
                    continue;
            else {
                tempSum = tempSum - arr[i];
                if(fisrtDigit == 0)
                    fisrtDigit = arr[i];
                else
                    secondDigit = arr[i];
            }

        }

        System.out.println("First:: "+fisrtDigit);
        System.out.println("Second:: "+secondDigit);

    }*/
    private static void findSumOfTwoDigit2(int[] arr, int sum) {

        int tempSum =sum;
        int fisrtDigit = 0;
        int secondDigit = 0;
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {

                tempSum = sum - arr[i];
                if(set.contains(tempSum)){
                    System.out.println(tempSum+"::"+arr[i]);
                    break;
                }
                set.add(arr[i]);

        }

        //System.out.println("First:: "+fisrtDigit);
        //System.out.println("Second:: "+secondDigit);
        //System.out.println(set);
    }
}
