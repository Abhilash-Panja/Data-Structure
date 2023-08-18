package Strings;
//https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1
public class Count_of_SubStrings {
   static  int longestUniqueSubsttr(String s){
       int maxcount=0;
      int [] n=new int[26];
      int i=0,j=0;
      while(j<s.length()){
        int index=s.charAt(j)-'a';
        if(n[index]==0){
            n[index]++;
            maxcount=Math.max(maxcount, j-i+1);
            j++;
        }
       else if(n[index]>=1){
         int  index2=s.charAt(i)-'a';
            n[index2]--;
            i++;
        }
      }
       return maxcount;
   } 
   public static void main(String[] args) {
    String s="geeksforgeeks";
    System.out.println(longestUniqueSubsttr( s));
   }
}
