package com.company.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {6,4,3,7,2,8};
        sort(arr);

    }

    private static void sort(int arr[]) {

        int n = arr.length-1;
        for(int i=0;i<n;i++){
            System.out.println("Interation: "+i);
            for(int j=i+1; j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                print(arr);
                System.out.println();
            }
        }

       /* for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
