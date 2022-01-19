package com.company.program;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
    public static void findPowerSet(String str) {
        int n = str.length();

        // `N` stores the total number of subsets
        int N = (int) Math.pow(2, n);
        List<String> result = new ArrayList<>();

        // generate each subset one by one
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();

            // check every bit of `i`
            for (int j = 0; j < n; j++) {
                // if j'th bit of `i` is set, print `S[j]`
                if ((i & (1 << j)) != 0) {
                    sb.append(str.charAt(j));
                }
            }
            result.add("'" + sb.toString() + "'");
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        //System.out.println(1>>4);
        //String str = "apple";
        //findPowerSet(str);

        int a[]={1,2,3,4,5};
        findSubOfArray(a,15);
    }

    public static  void findSubOfArray(int a[], int total){
        int len = (int)Math.pow(2,a.length);
        List<String> result = new ArrayList<>();
        for(int i=0;i<len;i++){
            StringBuilder sb = new StringBuilder();
            int sum=0;
            int index=0;
            for(int j=0;j<a.length;j++){
                if((i & (1<<j))!=0){
                    sb.append(a[j]);
                    sum= sum + a[j];
                    index++;
                    if(index==2){
                        System.out.println(sb);
                        //Math.abs(total-sum);
                        System.out.println(sum);
                        System.out.println(Math.abs(total-sum));
                        System.out.println("--");
                        break;
                    }

                }
            }

            result.add("'" + sb.toString() + "'");
        }
        System.out.println(result);
    }


}
