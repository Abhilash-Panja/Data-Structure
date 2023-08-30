package Strings;
import java.util.*;
public class Maximum_Nesting_Depth_of_the_Parentheses {
 static   int maxDepth(String s) {
       int maxi=0;
       Stack<Character>st=new Stack<>();
       for (int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            if(!st.empty()){
                maxi=Math.max(maxi, st.size());
            }
            st.push('(');
        }
        else if(s.charAt(i)==')'){
            if(!st.empty()){
                maxi=Math.max(maxi, st.size());
            }
            st.pop();
        }
       }
       return maxi;
    }
    public static void main(String[] args) {
        String s=  "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
}
