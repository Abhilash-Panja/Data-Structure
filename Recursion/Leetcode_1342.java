package Recursion;

public class Leetcode_1342 {
    static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
       if(num%2==0){
        return helper(num/2,steps+1);
       }
       else{
        return helper(num-1,steps+1);
       }
    }
   static  int numberOfSteps(int num) {
        return helper(num, 0);
       } 
       
    
    public static void main(String[] args) {
        int n=8;
        System.out.println(numberOfSteps(n));
    }
}
