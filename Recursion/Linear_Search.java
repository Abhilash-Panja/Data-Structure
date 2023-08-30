package Recursion;

public class Linear_Search {
static int Linear_search(int []a,int target){
return helper(a,target,0,a.length-1);
}
static int helper(int []a,int target,int start,int end ){
    if(start >end){
        return -1;
    }
    if(a[start]==target){
        return start;
    }
    else if(a[end]==target){
        return end;
    }
    return helper(a, target, start+1, end-1);
} 
public static void main(String[] args) {
    int a[]={1,23,5,8,10};
    System.out.println(Linear_search(a,2));
}  
}
