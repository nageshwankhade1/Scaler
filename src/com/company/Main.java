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
        /*Scanner sc = new Scanner(System.in);
        amount = new BigInteger(sc.nextLine());
        int noOfOperation = Integer.parseInt(sc.nextLine());
        System.out.println(amount);
        System.out.println(noOfOperation);
        for(int i=0;i<noOfOperation;i++){
            Integer type = Integer.parseInt(sc.next().trim());
            System.out.println("type::"+type);

            BigInteger tempAmount = new BigInteger(sc.nextLine().trim());

            operation(type, tempAmount);

        }
*/

  /*      //solve("scaler");
        Stream<BigDecimal> input = Stream.of(new BigDecimal(1), null, new BigDecimal(2), new BigDecimal(-1));
        input.filter(x->x!=null).filter(x->x.compareTo(BigDecimal.ZERO)>0);

        //System.out.println(input);
        input.forEach(System.out::println);*/

        System.out.println(-6%1000000007);

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
