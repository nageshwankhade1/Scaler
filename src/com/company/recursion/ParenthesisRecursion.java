package com.company.recursion;

public class ParenthesisRecursion {

    public static void main(String[] args) {
        solve("",3,0,0);
    }

    public static  void solve( String s, int n, int open, int close){

        if(s.length()==n*2){
            System.out.println(s);
            return;
        }

        if(open<n){
            solve(s.concat("("), n, open+1, close);
        }

        if(open>close){
            solve(s.concat(")"), n, open, close+1);
        }

    }
}
