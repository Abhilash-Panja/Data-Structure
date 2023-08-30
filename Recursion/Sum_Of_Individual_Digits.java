package Recursion;

public class Sum_Of_Individual_Digits {
    static int sum_Of_digits(int n){
        //base condition
        if(n==0){
            return 0;
        }
        
        return (n%10)+sum_Of_digits(n/10);
    }
    public static void main(String[] args) {
        int n=130;
        System.out.println(sum_Of_digits( n));
    }
}
