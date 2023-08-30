package Recursion;
import java.util.*;
public class SubSets_78_ {
    static List<List<Integer>> subsets(int[] a) {
      List<List<Integer>> outerList=new ArrayList<>();
      //adding the new Empty List to the outerList
      outerList.add(new ArrayList<>());
      for(int nums : a ){
         //creating the no of new copies of the According to the outerList size
         int n=outerList.size();
         for(int i=0;i<n;i++){
 //ArrayList<>(outerList.get(i)); it is an constructer and it will create the as it is copies
 //of the outer list it means frist we have the [] empty list and we have created that empty list
 //and ie [ [] [] ]inserted the 1 to the list .
            ArrayList<Integer> internalList=new ArrayList<>(outerList.get(i));
            internalList.add(nums);
            outerList.add(internalList);
         }
      }
      return outerList;
    }
    
    public static void main(String[] args) {
        int[]a={1,2,3};
        System.out.println(subsets(a));
    }
    
}
