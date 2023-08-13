package Strings;

import java.util.HashMap;

public class Most_Occurence {
    static int smallSorting(String s) {
		int [] n=new int[26];
        for(int i=0;i<s.length();i++){
          int index=s.charAt(i)-'a';
          n[index]++;
        }
        int maxi=Integer.MIN_VALUE;
        int in=-1;
        for(int i=0;i<26;i++){
            if(maxi<n[i]){
             in=i;
             maxi=n[i];
            }
        }
        return in;
        }
        static char Most_Occurencee(String s){
            int n=smallSorting(s);
            return (char)(n+'a');
        }
        public static void main(String[] args) {
            String s="abbaaeee";
            System.out.println( Most_Occurencee( s));
        }
        
	}
   
    

