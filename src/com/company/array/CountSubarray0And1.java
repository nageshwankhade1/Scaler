package com.company.array;

import java.util.HashMap;

public class CountSubarray0And1 {

    public static void main(String[] args) {
        int n=7;
        int arr[] = {1,0,0,1,0,1,1};

        System.out.println(countSubarrWithEqualZeroAndOne(arr,n));
    }
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum =0;
        int count =0;
        for(int i=0;i<n;i++)
        {
            //Replacing 0's in arrays by -1
            if(arr[i]==0)

                arr[i] = -1;

            sum  += arr[i];
            if (sum==0)//if sum=0 means there are equal number of 0's and 1's
            {
                count ++;
            }
            if (h.containsKey(sum))
            {
                count += h.get(sum);
            }
            if(!h.containsKey(sum))
            {
                h.put(sum,1);
            }
            else
            {
                h.put(sum,h.get(sum)+1);
            }
        }
        return count;
    }
}
