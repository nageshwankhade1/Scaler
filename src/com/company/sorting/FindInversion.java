package com.company.sorting;

public class FindInversion {
    public  static  int count = 0;
    public static void main(String[] args) {
        int a[] = new int[]{28, 18, 44, 49, 41, 14};
        merge(a, 0 , a.length-1);
        System.out.println(count);
    }

    public static int[] merge(int a[], int l, int r){

        if(l==r){
            int t[] = new int[1];
            t[0]=a[l];
            return t;
        }

        int mid = l + (r-l)/2;

        int left[] = merge(a, l, mid);
        int right[] = merge(a, mid+1, r);

        return mergeToSort(left, right);
    }

    public static int[] mergeToSort(int l[], int r[]){
        int n = l.length;
        int m = r.length;
        int res[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(l[i]<=r[j]){
                res[k]=l[i];
                i++;
                k++;
            }else{
                count=count + (n-i);
                res[k]=r[j];
                j++;
                k++;
            }
        }

        while(i<n){
            res[k] = l[i];
            k++;
            i++;
        }

        while(j<m){
            res[k]=r[j];
            k++;
            j++;
        }

        return res;

    }

}
