package com.company.recursion;
//find min cost of convert String A to B.
public class EditDistance {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abe";
        System.out.println(cost(str1,str2));
    }
    public static int cost(String a, String b){

        if(b.length()==0){
            return 2 * a.length()-1;
        }
        if(a.length()==0){
            return 2 * b.length()-1;
        }

        return Math.min(Math.min( 2+cost(a, b.substring(0, b.length()-1)),
                        2+cost(a.substring(0, a.length()-1), b)),
                            3+cost(a.substring(0,a.length()-1), b.substring(0,b.length()-1)));
    }
}
