package Arrays;

public class Kadans_Algo {
/*
 Finding the sum of the largest sub array
*/
public int maxSubArray(int[] a) {
    int maxi=Integer.MIN_VALUE;
      int currentsum=0;
      for(int i=0;i<a.length;i++){
          currentsum+=a[i];
          maxi=Math.max(currentsum,maxi);
          if(currentsum<0){
              currentsum=0;
          }
      }
      return maxi;
  }
}
