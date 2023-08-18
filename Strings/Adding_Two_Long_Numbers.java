package Strings;

public class Adding_Two_Long_Numbers {
   static String add(String n1,String n2){
    int i=n1.length()-1;
    int j=n2.length()-1;
    String result="";
    int carry=0;
    while(i>=0 && j>=0){
        int num1=n1.charAt(i)-'0';
        int num2=n2.charAt(j)-'0';
        num1=num1+num2+carry;
       carry=num1/10;
       char c=(char)((num1%10)+('0'));
       result+=c;
       //System.out.println(result);
       i--;
       j--;
    }
    
    while(i>=0){
     int  num1=n1.charAt(i)-'0';
     num1+=carry;
     char c=(char)((num1%10)+('0'));
       result+=c;
     carry=num1/10;
     i--;

    }
   
    while(j>=0){
    int  num1=n2.charAt(j)-'0';
     num1+=carry;
     char c=(char)((num1%10)+('0'));
       result+=c;
     carry=num1/10;
     j--;
    }
   if(carry==1){
     result+="1";
   }
   StringBuffer res=new StringBuffer(result);
   int k=res.length()-1;
   while(k>0 &&res.charAt(k)=='0' ){
    res.deleteCharAt(k);
    k--;
   }
   return res.reverse().toString();
 }
public static void main(String[] args) {
    String n1="0000";
    String n2="0";
    System.out.println(add(n1, n2));
}
}
