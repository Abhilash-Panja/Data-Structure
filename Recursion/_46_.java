package Recursion;

import java.util.*;

public class _46_ {
    static void permute(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
      helper(list,nums);  
    }
    static void helper(ArrayList<Integer> p,int []up){
        if(up.length==0){
            System.out.println(p);
            return;
        }
        int n=p.size()+1;
        for(int i=0;i<n;i++){
            int element=up[0];
           List<Integer> frist= p.subList(0,i);
           List<Integer> second=p.subList(i, up.length);
           frist.add(element);
           second.add(element);
             helper(p, Arrays.copyOfRange(up,1,up.length));
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        permute(a);
    }
}
