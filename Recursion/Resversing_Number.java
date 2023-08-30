package Recursion;

public class Resversing_Number {
    static int reverse(int n){
        //when we perform this (n%10)+((reverse(n/10))) it will change for every function call 
        //so we need a helper function which can able to pass more arguments and achveing the requried result
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
       int rem =n%10;
        return  ((rem) *(int)(Math.pow(10, digits-1)))+helper(n/10,digits-1);
    }

    public static void main(String[] args) {
        int n=123;
        System.out.println(reverse(n));
    }
}
