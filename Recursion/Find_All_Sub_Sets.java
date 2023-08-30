package Recursion;
import java.util.*;
//p-->procesed String
//up--->Unprocessed String
public class Find_All_Sub_Sets {
   static  void Task(String p,String up){
   if(up.isEmpty()){
    System.out.println(p);
    return;
   }
   Task(p+up.charAt(0), up.substring(1));
   Task(p, up.substring(1));
   }
   static  ArrayList<String> Task2(String p,String up){
    ArrayList<String> list=new ArrayList<>();
   if(up.isEmpty()){
   
   list.add(p);
   return list;
   }
  ArrayList<String> left= Task2(p+up.charAt(0), up.substring(1));
   ArrayList<String> right=Task2(p, up.substring(1));
   list.addAll(left);
   list.addAll(right);
   return list;
   }
   public static void main(String[] args) {
    System.out.println(Task2("", "abc"));
   }
   
}

