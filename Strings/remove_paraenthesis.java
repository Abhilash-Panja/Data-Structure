package Strings;
import java.util.*;
public class remove_paraenthesis {
 /*   static String removeOuterParentheses(String s) { 
    Stack<Character> l=new Stack<>();
    String result="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            if(!l.empty()){
                result+="(";
            }
            l.push('(');
        }
        else if(s.charAt(i)==')'){
            l.pop();
            if(!l.empty()){
            result+=")";
            }
        }
    }
    return result;
   } */
  // More optimised code 
   static String removeOuterParentheses(String s) { 
    int c=0;
    String result="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            c++;
            if(c>=2){
           result+="(";
            }
        }
        else if(s.charAt(i)==')'){
            c--;
            if(c>=1){
                result+=")";
            }
        }
    }
    return result;
   }
  
   public static void main(String[] args) {
    String s="(()())(())(()(()))";
    System.out.println(removeOuterParentheses( s));
   }
}
