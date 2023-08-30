package Strings;
import java.util.*;
public class Task {
   static void print(int r,int c){
      if(r==0){return;}
      if(c<r){
         System.out.print("*");
         print(r, c+1);
      }
      else{
         System.out.println();
         print(r-1, 0);
      }
   }

static void print2(int r,int c){
      if(r==0){return;}
      if(c<r){
         print2(r, c+1);
          System.out.print("*");
      }
      else{
         print2(r-1, 0);
         System.out.println();
      }
   }
static void bubbleSortsort(int []a,int n,int index){
   if(n==0){return ;}
   if(index<n){
      if(a[index]>a[index+1]){
         int temp=a[index];
         a[index]=a[index+1];
         a[index+1]=temp;
         bubbleSortsort(a, n, index+1);
      }
   }
   else{
     bubbleSortsort(a, n-1, 0);
   }
}
static void selectionsort(int []a,int n,int index,int max){
    if(n==0){return ;}
   if(index<n){
       if(a[index]>a[max]){
         selectionsort(a, n, index+1, index);
       }
       else{
         selectionsort(a, n, index+1, max);
       }
        
      }
   else{
      int temp=a[max];
      a[max]=a[n-1];
      a[n-1]=temp;
    selectionsort(a, n-1, 0, 0);
   }
}
   public static void main(String[] args) {
   // print2(4, 0);
    int []a={4,3,2,1};
    //bubbleSortsort(a, 3, 0);
    selectionsort(a, 4, 0, 0);
    System.out.println(Arrays.toString(a));
    
   } 
}
