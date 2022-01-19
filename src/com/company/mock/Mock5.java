package com.company.mock;

/**
 *  two sorted arrays
 *  find
 *
 *  arr1[] :: {1,2 ,3,4,5}
 *  arr2{} :: {6,7,8,9,10}
 *  1
 *
 */

public class Mock5 {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};

        //1 3 4 5 6
        // 2 4 5 7

        // n1 = 1
        //n2 = 6

        //n1-2 || n2-2 min =1
        //3 || 2 min=1
        //4 || 1 min ==1
        //6 || 1 min =1
        //                                         0 1 2 3 4 5 6
        //                                             |       |

        findMinDiffTwoElement(arr1, arr2);
    }

    public static void findMinDiffTwoElement(int arr1[], int arr2[]){
        int min = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                int diff = Math.abs(arr1[i] - arr2[j]);
                if(min>diff){
                    min = diff;
                    num1 = arr1[i];
                    num2 = arr2[j];
                }
            }
        }
        System.out.println("Num1::"+num1);
        System.out.println("Num2::"+num2);
    }
}
