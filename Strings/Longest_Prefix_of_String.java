package Strings;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1
public class Longest_Prefix_of_String {
 static   int lps(String s) {
        int []lps=new int[s.length()+1];
        int frist=0;
        int second=2;
       char []n=new char[s.length()+1];
            for(int i=1;i<=s.length();i++){
                int index=i-1;
                n[i]=(char)s.charAt(index); 
            }
           System.out.println(Arrays.toString(n));
            
            while(second<s.length()+1){
                if(n[frist+1]==n[second]){
                    lps[second]=frist+1;
                   // System.out.println(frist);
                    frist++;
                    second++;
                }
                else{
                    second++;
                    if(frist==0){
                        second++;
                        
                    }
                    else
                    {
                      frist=lps[frist];  
                    }

                   
                }
            }

            
           System.out.println(Arrays.toString(lps));
        
           return lps[lps.length-1];
      
    }  
    public static void main(String[] args) {
        String s="aacecaaa$aaacecaa";
        System.out.println(lps(s));
    }
}
