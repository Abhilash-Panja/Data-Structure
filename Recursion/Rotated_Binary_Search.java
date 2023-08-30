package Recursion;

public class Rotated_Binary_Search {
    static int search1(int []a,int target){
        return helper1(a, target, 0, a.length-1);
    }
    static int helper1(int []a,int target,int start,int end){
if(start > end) return -1;
        int mid=start+(end-start)/2;
        if(a[mid]==target){
        return mid;
        }
        if(a[start] <= a[mid]){
            if(target >=a[start] && target <=a[mid]){
                return helper1(a, target, start, mid-1);
            }
            else{
                return helper1(a, target, mid+1, end);
            }
        }
        if(target > a[mid] && target <=a[end]){
            return helper1(a, target, mid+1, end);
        }
       return helper1(a, target, start, mid-1);
    }
   static boolean search(int [] a,int target) {
   return helper(a, target, 0,a.length-1);
   }
   static boolean helper(int []a,int target,int start,int end){
    if(start >end){
      return false;

    }
    int mid=start+(end-start)/2;
    if(a[mid]==target){
        return true;
        }
        if(a[start] <= a[mid]){
            if(target >=a[start] && target <=a[mid]){
                return helper(a, target, start, mid-1);
            }
            else{
                return helper(a, target, mid+1, end);
            }
        }
        if(target > a[mid] && target <=a[end]){
            return helper(a, target, mid+1, end);
        }
       return helper(a, target, start, mid-1);
    }

   
   

    public static void main(String[] args) {
        int [] a={2,5,6,0,0,1,2};
        System.out.println(search(a, 3));
    }
}
