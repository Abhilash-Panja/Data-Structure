package Recursion;

public class Checking_Is_Array_Sorted {
    static boolean Is_Sorted(int [] a){
        return helper(a,0);
    }
    static boolean helper(int []a,int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]<a[i+1]){
            return helper(a, i+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int []a={1,4,3};
        System.out.println(Is_Sorted(a));
    }
}
