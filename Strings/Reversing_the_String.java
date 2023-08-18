package Strings;
import java.util.*;
public class Reversing_the_String {
  static String reverseWords(String s) {
      String n[]=new String[s.length()];
      n=s.trim().split("\\s+");
      //System.out.println(Arrays.toString(n));
      reverse(n); 
     // System.out.println(Arrays.toString(n));

      return String.join(" ", n); 
    }
    static void reverse (String [] s){
        int start=0;
        int end=s.length-1;
        while(start<end){
        String temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        }
    }
    public static void main(String[] args) {
        String s="  hello world  ";
        String s1="the sky is blue";
        String s2="a good   example";

        System.out.println(reverseWords( s)+"\n"+reverseWords( s1)+"\n"+reverseWords( s2));
    }
}
