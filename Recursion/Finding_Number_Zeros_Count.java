package Recursion;

public class Finding_Number_Zeros_Count {
    static int count(int n,int count){
        if(n/10==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
        count++;
        }
        return count(n/10,count); 
    }
    public static void main(String[] args) {
        int n=30200;
        System.out.println(count(n,0));
    }
}
