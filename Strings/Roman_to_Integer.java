package Strings;
import java.util.*;
public class Roman_to_Integer {
  static int romanToInt(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
      if( map.get(s.charAt(i)) < map.get(s.charAt(i+1)))  {
        // System.out.println(value);
            value=value-map.get(s.charAt(i));
            // System.out.println(map.get(s.charAt(i)));
            //  System.out.println(map.get(s.charAt(i-1)));
            }else{
        value+=map.get(s.charAt(i));
            }
            
        }
     return value;
    }
    public static void main(String[] args) {
        String s="IX";
    System.out.println(romanToInt( s));
    }
}
