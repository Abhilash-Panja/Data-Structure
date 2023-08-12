package Arrays;

public class Longest_Subarray_with_given_Sum_K_Positives {
    static int longestSubarray(int[] a,int k) {
    	int i=0,j=0;
    	int sum=0;
    	int max=Integer.MIN_VALUE;
    	while(j<a.length) {
    		sum+=a[j];
    		if(sum<k) {
    			j++;
    		}
    		else if(sum==k) {
    			max=Math.max(max, j-i+1);
    			j++;
    		}
    		else if(sum>k) {
    			while(sum>k) {
    				sum-=a[i];
    				i++;
    			}
    			j++;
    		}
    	}
    	return max;
    }
}
