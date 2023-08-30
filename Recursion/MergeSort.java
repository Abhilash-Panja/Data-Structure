package Recursion;
import java.util.*;
public class MergeSort {
    static int[] mergesort(int [] a){
        if(a.length==1){
            return a;
        }
        //dividing the array into two halfs
 //dividing the array in to single length array then could be only consisting as single array so it is sorted
        int mid=a.length/2;
        int []left=mergesort(Arrays.copyOfRange(a, 0, mid));
        int []right=mergesort(Arrays.copyOfRange(a,mid,a.length));
       return merge(left,right);
    }
    static int[] merge(int []left,int []right){
        int i=0;
        int j=0;
        int k=0;
        int []result=new int[left.length+right.length];
        while(i<left.length && j<right.length){
         if(left[i]>right[j]){
            result[k]=right[j];
            k++;
            j++;
         }
         else{
            result[k]=left[i];
            i++;
            k++;
         }
        }
        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
         while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[]a={4,3,2,1};
         System.out.println(Arrays.toString(mergesort(a)));
    }
}
