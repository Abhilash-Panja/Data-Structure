package Recursion;

import java.util.*;

public class _17_ {
     static void letterCombinations1(String digits) {
       helper1("",digits);
    }
    static void helper1(String p,String up ){
     if(up.isEmpty()){
        System.out.println(p);
        return;
     }
     int value=up.charAt(0)-'0';
     int start=0;
     int end=0;
     if(value==7){
     start=3*(7-2);
     end=(3*6)+1;
     }
     if(value==8){
     start=(3*6)+1;
     end=(3*7)+1;
     }
     if(value==9){
     start=(3*7)+1;
     end=(3*9)-1;
     }
     if(value!=7 && value!=8 && value!=9){
     start=(value-2)*3;
     end=(value-1)*3;
     }
    
     for(int i=start;i<end;i++){
        char c=(char)('a'+i);
        helper1(p+c, up.substring(1));
     }
    
    }
//returning the arraylist
 static ArrayList<String> letterCombinations(String digits) {
    if(digits.length()==0){
        return new ArrayList<String>();
    }
    else{
        return helper2("",digits);
    }
       
    }
    static ArrayList<String> helper2(String p,String up ){
     if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
       list.add(p);
        return list;
     }
     int value=up.charAt(0)-'0';
     int start=0;
     int end=0;
     ArrayList<String> list2=new ArrayList<>();
     if(value==7){
     start=3*(7-2);
     end=(3*6)+1;
     }
     if(value==8){
     start=(3*6)+1;
     end=(3*7)+1;
     }
     if(value==9){
     start=(3*7)+1;
     end=(3*9)-1;
     }
     if(value!=7 && value!=8 && value!=9){
     start=(value-2)*3;
     end=(value-1)*3;
     }
    
     for(int i=start;i<end;i++){
        char c=(char)('a'+i);
     list2.addAll(helper2(p+c, up.substring(1)));
     }
    return list2;
    }


    public static void main(String[] args) {
        String s="23";
       System.out.println(letterCombinations(s)); 
    }
}
