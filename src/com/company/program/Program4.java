package com.company.program;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Program4 {
     public static void main(String[] args) {
         /*String str = "1.30000000000000E9";
         String st1 = "2.00000181334612E15";
         Double d = (Double. parseDouble(str));
         System. out. println(d);*/
         //BigInteger bigInt = new BigInteger("1.30000000000000E9");
         //System.out.println( new BigDecimal("1.30000000000000E9").toBigInteger());
         //406770000244 000000000000
         String str3  = "1.30000000000000E9";
         //double value = 2.012345678E9 ;//real 205809104.13
        // System.out.println(BigDecimal.valueOf(Double.valueOf(str3)));
         //"2.0123456E7"
         //"100.22"
         //"2,01,67,72,760.32'
         System.out.println(BigDecimal.valueOf(Double.valueOf("1.18712881800000E+09")).multiply(new BigDecimal("0000114.8")));
        //136282388306.4
        //136282388306.4
         //dailySecType.setmCAP(dailySecType.getClosePrice().multiply(issueCap));



     }
}
