package Recursion;
import java.util.*;
public class BubbleSort {
    static void bubbleSort(int []a,int n,int c){
        if(n==0){
            return;
        }
     if(c<n){
        if(a[c]>a[c+1]){
         int temp=a[c];
        a[c]=a[c+1];
        a[c+1]=temp;
        }
        bubbleSort(a, n, c+1);
       
     }
     else{
        bubbleSort(a, n-1, 0);
     }
     
    }
    static void  SelectionSort(int []a,int n,int max,int c){
        if(n==0){
            return;
        }
    if(c<n){
        if(a[c] >a[max]){
         SelectionSort(a, n, c, c+1);
        }
        else{
            SelectionSort(a, n, max, c+1);
        }
        
    }
    else{
        int temp=a[max];
        a[max]=a[n-1];
        a[n-1]=temp;
        SelectionSort(a, n-1, 0, 0);
    }
     }
    public static void main(String[] args) {
        int []a={4,3,2,1};
       // bubbleSort(a, 3, 0);
       SelectionSort(a, 4, 0, 0);
        System.out.println(Arrays.toString(a));
    }
}
