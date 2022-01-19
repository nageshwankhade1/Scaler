package com.company.array;

public class OneAdd {
    public static void main(String[] args) {
        int a[] = new int[]{0,1,2,9};
        int[] output = plusOne(a);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }

    public static int[] plusOne(int[] digits) {
       /* int[] newNum = new int[digits.length+1];

        for (int end = digits.length-1; end >=0  ; end--){
            if ( digits[end] != 9 ){
                digits[end]++;
                newNum=digits ;
                break;
            }
            else if (digits[end] == 9){
                digits[end] = 0 ;
                if (end == 0){
                    newNum[0] = 1 ;
                    for (int i = 0 ; i < digits.length ; i++ ){
                        newNum[i+1] = digits[i];
                    }
                }
            }
        }

        return newNum ;*/

        int len = digits.length;
        for(int i = len-1; i >= 0; i--){
            digits[i] += 1;
            if(digits[i] <= 9){
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[len+1];

        res[0] = 1;
        return res;
    }
}
