package com.company.program;

public class Program6 {

    public static void main(String[] args) {
        System.out.println(reverse("blue is sky the"));
    }

    public static String reverse(String str){
        //byte[] bytes = str.getBytes();
        char [] bytes = str.toCharArray();
        int count = str.length();

        int n = count - 1;

        for(int j = (n-1)>>1; j>=0; j--){
            int k = n - j;
            char temp = bytes[j];

            bytes[j] = bytes[k];
            bytes[k] = temp;
        }
        return String.valueOf(bytes);
    }
}
