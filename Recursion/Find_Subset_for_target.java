package Recursion;

import java.lang.reflect.Array;
import java.util.*;

public class Find_Subset_for_target {
    static void task(int []a,int target){
        Arrays.sort(a);
        ArrayList<Integer> list=new ArrayList<>();
     helper(list,a, target);
    }
    static void helper(ArrayList<Integer> p,int []a,int up){
        if(up==0){
            System.out.println(p);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<=up){
                p.add(a[i]);
                helper(p, a, up-a[i]);
                p.remove(p.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        int []a={2,3,6,7};
        int target=7;
        task(a, target);
    }
}
