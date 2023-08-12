package Arrays;

public class Maximum_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] a) {
        int currentcount=0;
        int maxcount=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==1) {
                currentcount++;
                maxcount=Math.max(maxcount, currentcount);
            }
            else if(a[i]!=1) {
                currentcount=0;
            }
        }
        return maxcount;
     }
}
