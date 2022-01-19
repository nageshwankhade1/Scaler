package com.company.mock;
//A: [2, 3 , 5 ,8 ,1 ,6]
//pf:[2, 5, 10, 18, 19, 25]

// pf[i] - pf[len-1]-pf[i] => 2 - (25-2) => 21  -   21
// pf[i] - pf[len-1]-pf[i] => 5 - (25-5) => 15  -   15
// pf[i] - pf[len-1]-pf[i] => 10 -(25-10)=> 5   -   5
// pf[i] - pf[len-1]-pf[i] => 18 -(25-18)=> 11  -   11
// pf[i] - pf[len-1]-pf[i] => 19 -(25-19)=> 13  -   13
// pf[i] - pf[len-1]-pf[i] => 19 -(25-19)=> 2  -    2

/*
* 2 - (-77) = 79 - 0
* 5 - (-80) = 85 - 1
* 10 - (-85) = 95 -2
* 18 - (-93) = 111 -3
* 19 -(-94) = 113 -4
* 25 -(-100) = 125 -5
* */

//T:: O(N)
//S:: O(1)

public class Mock1 {

    public static void main(String[] args) {

        int arr[] = new int[]{2, 3 , 5 ,8 ,1 ,6};
        //int arr[] = new int[]{1 ,2 , 3 ,4, 5, 100};           //  15-100  =   85
        //2, 5 , 6, 8, 10, 12                                   //  10-105  =   95
                                                                //  06-109  =   103

        System.out.println(getIndexDiffLeftNRightArray(arr));

    }
    public static int getIndexDiffLeftNRightArray(int arr[]){
        int sum = calSum(arr);
        int minDiff = Integer.MAX_VALUE;
        int index = -1 ;
        int leftSum =0;
        for(int i=0;i<arr.length;i++){
            leftSum += arr[i];
            int diff = Math.abs(leftSum - (sum-leftSum));
            if(minDiff>(diff)){
                minDiff = diff;
                index = i;
            }
        }
        return index;
    }

    //calculate prefix
    public static int calSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
