package Strings;
//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
//just we are comparing the smallest and largest string 
import java.util.*;
public class Longest_Common_Prefix {
 static   String longestCommonPrefix(String a[], int n){
        int i=0;
        Arrays.sort(a);
      String x=a[0];
            String y=a[n-1];
            while(i<x.length() && i<y.length()){
                if(x.charAt(i)==y.charAt(i)){
                    i++;
                }
                else{
                    break;
                }
            }
       if(i!=0){
        return x.substring(0,i);
       }
       else{
        return "-1";
       }
    } 
    public static void main(String[] args) {
        String []s={"goo","kom","aum","zum"};
        System.out.println(longestCommonPrefix(s, 4));
    }
}
