package Strings;
import java.util.*;
public class Isomorphic_Strings {
   static boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
       for(int i=0;i<s.length();i++){
        if(map1.containsKey(s.charAt(i))){
            if(map1.get(s.charAt(i))!=t.charAt(i)){
            return false;  
            }}
            else if(map1.containsValue(t.charAt(i))){
                return false;
            }
            
        
        else{
            map1.put(s.charAt(i),t.charAt(i));
            
        }
       }
   
    return true;
    
    }
    public static void main(String[] args) {
        

        String s1="badc";
        String s2="baba";
        System.out.println(isIsomorphic( s1, s2));

    }
}
