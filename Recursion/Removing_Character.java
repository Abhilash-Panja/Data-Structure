package Recursion;

public class Removing_Character {
    static String task(String s,int i){
        if(s.length() == i){
            return "";
        }
        String result="";
        if(s.charAt(i)!='a'){
         result+=s.charAt(i);
        }
        return result+task(s, i+1);
    }
    static String task1(String s){
        String result="";
        return helper(s,result,0);
    }
    static String helper(String s,String resuslt,int i){
        if(i==s.length()){
            return resuslt;
        }
        if(s.charAt(i)!='a'){
            resuslt+=s.charAt(i);
        }
        return helper(s, resuslt, i+1);
    }
    public static void main(String[] args) {
        String s="abcaada";
        System.out.println(task1(s));
    }
}
