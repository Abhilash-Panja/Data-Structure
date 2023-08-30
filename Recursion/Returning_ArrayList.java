package Recursion;
import java.util.*;
public class Returning_ArrayList {
    static ArrayList find(int [] a,int index,int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==a.length){
            return list;
        }
        if(a[index]==target){
            list.add(index);
        }
        ArrayList<Integer>before_Answers= find(a, index+1, target);
        list.addAll(before_Answers);
        return list;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,4,5};
        System.out.println(find(a, 0, 4));
    }
}
