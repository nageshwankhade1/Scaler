package com.company.array;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = new int[]{2,3,1,2,3};
        int n=a.length;

        for (int i = 0; i < n; i++)
        {
            int index = a[i] % n;
            a[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++)
        {
            if ((a[i] / n) >= 2)
                System.out.print(i + " ");
        }
    }
}
