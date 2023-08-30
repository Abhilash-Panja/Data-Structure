package Recursion;

public class _1922_ {
static    int countGoodNumbers(long n) {
    long mid=n/2;
     if(n%2==0){
        return (int) (Math.pow(5,n/2) * Math.pow(4, n/2));
     }  
     else{
        return (int) (Math.pow(5,mid+1) * Math.pow(4, n-(mid+1)));
     } 
     
    }
    public static void main(String[] args) {
        long n=1;
        System.out.println(countGoodNumbers( 50));
        //564908303
    }
}
