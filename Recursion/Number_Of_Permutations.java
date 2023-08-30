package Recursion;

import java.util.ArrayList;

public class Number_Of_Permutations {
    static void task(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int n=p.length();
        for(int i=0;i<=n;i++){
            char c=up.charAt(0);
            String fristString=p.substring(0, i);
            String secondString=p.substring(i, p.length());
            task(fristString+c+secondString, up.substring(1));
        }
    }
//Returning with ArrayList:
static ArrayList<String> task2(String p,String up){
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        int n=p.length();
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i<=n;i++){
            char c=up.charAt(0);
            String fristString=p.substring(0, i);
            String secondString=p.substring(i, p.length());
          list2.addAll(task2(fristString+c+secondString, up.substring(1)))  ;
        }
        return list2;
    }
    static int task3(String p,String up){
        if(up.isEmpty()){
           return 1;
        }
        int count=0;
        int n=p.length();
        for(int i=0;i<=n;i++){
            char c=up.charAt(0);
            String fristString=p.substring(0, i);
            String secondString=p.substring(i, p.length());
            count=count+task3(fristString+c+secondString, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        String s="abc";
          // task("", s);
           System.out.println(task3("",s));
    }
}
