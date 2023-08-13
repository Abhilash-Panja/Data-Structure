package Strings;

import java.util.Scanner;

public class Basic_operations_on_String {
    static void operation(String s){
        String s1="Abhi";
        System.out.println(s+s1);
        StringBuffer str=new StringBuffer(s);
        System.out.println(str.append(s));
        //we can able to covert the StringBuffer into String by using the to String method
        //ie str.toString();
        //we ca able to the input with including space by using the nextLine
        //ie String s=sc.nextLine();
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // System.out.println(s);
        // System.out.println("Abhilash Panja \"good\" boy");
        //Sorting the String
        String s1="ADBCCAaabb";
        int [] n=new int[25];
        for(int i=0;i<s1.length();i++){
          int index=s1.charAt(i)-'a';
          n[index]++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<n[i];j++){
                char c=(char)('a'+i);
                System.out.print(c+" ");
            }
        }
        int [] x=new int[25];
        for(int i=0;i<s1.length();i++){
          int index=s1.charAt(i)-'A';
          x[index]++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<x[i];j++){
                char c=(char)('A'+i);
                System.out.print(c+" ");
            }
        }
    }
}

