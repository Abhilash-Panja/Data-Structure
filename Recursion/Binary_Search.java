package Recursion;

public class Binary_Search {
    static int search(int []a,int target){
    return helper(a,0,a.length-1,target);
    }
    static int helper(int [] a,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==target){
            return m;
             }
              if(a[m]<target){
            return helper(a, m+1, e, target);
             }
             else{
                return helper(a, s, m-1, target);
             }
    }
    public static void main(String[] args) {
        int [] a={2,3,5,7,9};
        System.out.println(search(a, 4));
    }
}
