package Sub_Arrays;

import java.util.HashMap;

public class Subarray_Divisible_By_k {
    public int subarraysDivByK(int[] a, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int rem=0,sum=0,result=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                result+=map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return result;

    }
}
