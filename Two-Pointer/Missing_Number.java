class Solution {
public int missingNumber(int[] a) {
        int maxi=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxi){
                maxi=a[i];
            }
        }
     if(maxi<a.length){
           maxi=a.length;
        }
        int sum_of_n_numbers=(maxi*(maxi+1))/2;
        int sum_of_array=0;
        for(int i=0;i<a.length;i++){
            sum_of_array+=a[i];
        }
        return sum_of_n_numbers-sum_of_array;
    }
}