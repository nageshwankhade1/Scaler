package com.company.program;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Program5 {

    public static void main(String[] args) {
        int arr[] = new int[]{12, 10, 28, 37, 43, 40, 14, 12, 48};
        //solve(arr);
        String date = "07-AUG-20199";
        StringBuilder sb = new StringBuilder(date.substring(0,4));
        sb.append(date.substring(4,6).toLowerCase(Locale.ROOT))
                .append(date.substring(6));

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
       // System.out.println(Date.from(LocalDate.parse(sb.toString(), pattern).atStartOfDay(ZoneId.systemDefault()).toInstant()));
        System.out.println(new SimpleDateFormat("ddMMyy").format(new java.util.Date()));
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(new java.util.Date()));

        sb.reverse();

        System.out.println(5>>1);

    }

    public static int solve(int[] A) {
        Set<Integer> set = new HashSet<>();
        String chars ="X";
        set.contains(null);
        //12, 10, 28, 37, 43, 40, 14, 12, 48
        for(int i=0;i<A.length;i++){
            System.out.println("Chars::"+chars);
            if(A[i]%2==0 && !chars.equals("E")){
                set.add(A[i]);
                chars ="E";
                System.out.println(A[i]+"::"+chars);
            }
            else if(!(chars.equals("O")) && A[i]%2!=0){
                set.add(A[i]);
                chars ="O";
                System.out.println(A[i]+"::"+chars);
            }
        }

        return set.size();
    }
}
