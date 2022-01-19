package com.company.mock;

public class Mock4 {
    //A: [1 2 3 4 5]
    //o/p: 2nd largest element

    public static void main(String[] args) {
        int arr[] = new int[]{-10,-20,-15};

        System.out.println(findSecondLargestElement(arr));
    }
    public static int findSecondLargestElement(int arr[]){

        // 1, 2 , 5, -1, 7
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        if(arr.length<=1){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
          if(arr[i]>firstLarge){
              secondLarge = firstLarge;
              firstLarge = arr[i];
          }
          else if(arr[i]>secondLarge){
              secondLarge = arr[i];
          }

        }

        return secondLarge;
    }
}
