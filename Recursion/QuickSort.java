package Recursion;
import java.util.*;
public class QuickSort {
    static void sort(int []a,int low,int high){
        if(low>high){
            return;
        }
        int mid=low+(high-low)/2;
        int pivot=a[mid];
        int start=low;
        int end=high;
        while(start<=end){ //take this {1,-4,-2} 
            while(a[start]<pivot){
                start++;
            }
            while(a[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }

        }
        sort(a,low,end);
        sort(a, start, high);
    }
    public static void main(String[] args) {
        int[]a={5,-4,3,0,-2,1};
        sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
