package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    static BigInteger amount = BigInteger.ZERO;
    public static void main(String[] args) {
        System.out.println(power(3,2));
      }

      public static int power(long x, long y){
        long res = 1;
        while(y!=0){

                if(y%2==1){
                    res = x * res;
                }
                x = x*x;
                y/=2;
            }
        return (int)res;
      }
    static  void operation(int type, BigInteger tempAmount ){

        if(type==1){
            //amount = amount + tempAmount;
            amount = tempAmount.add(new BigInteger(String.valueOf(amount)));
            System.out.println("Amount::"+amount);
        }else if(type == 2){
            if(tempAmount.compareTo(amount)>0){
                System.out.println("Insufficient Funds");
            }
            amount = amount.subtract(tempAmount) ;
            System.out.println("Amount::"+amount);
        }

    }

    public static void solve(String str){
        HashMap<String, Integer> map= new HashMap<>();
        int j=1;
        for(int i=65;i<=90;i++){
            //System.out.print((char)i+" ");
            map.put(String.valueOf((char)i),j);
            j++;
        }
        System.out.println(map);
        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<str.length();i++){
            System.out.println(String.valueOf(str.charAt(i)).toUpperCase());
            stringBuilder.append(str.charAt(i)).append(map.get(String.valueOf(str.charAt(i)).toUpperCase()));
        }
        System.out.println(stringBuilder);
    }

}
