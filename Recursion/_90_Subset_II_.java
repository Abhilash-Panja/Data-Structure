package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class _90_Subset_II_ {
//it is extension of the subset-I and here we are getting the duplicate subsets to avoid this frist 
//we should avoid the duplicate numbers in the array just we are creating the subsets for the duplicte numbers
//which create a problem so we are using the single pointer to determine how many subsets were their 
//in the outer arraylist if encounter any duplicte we will create  
 static   List<List<Integer>> subsetsWithDup(int[] a) {
      List<List<Integer>> outerList=new ArrayList<>();
      int start=0;
      int end=0;
      outerList.add(new ArrayList<>());
      Arrays.sort(a);
      for(int i=0;i<a.length;i++ ){
         int n=outerList.size();
         start=0;
         if(i>0 && a[i]==a[i-1]){
           start=end+1;
         }
         end=outerList.size()-1;
         for(int j=start;j<n;j++){
            ArrayList<Integer> internalList=new ArrayList<>(outerList.get(j));
            internalList.add(a[i]);
            outerList.add(internalList);
         }
      }
      return outerList;
    }
    public static void main(String[] args) {
        int []a={1,2,2};
        System.out.println(subsetsWithDup(a));
    }
}
