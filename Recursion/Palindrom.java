package Recursion;

public class Palindrom {
    static boolean rev(int n){
        int digits=(int) Math.log10(n)+1;
     return n==helper(n,digits);
    }
    static int helper(int n,int digits){
        //base condition
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(rev(n));
    }
}
