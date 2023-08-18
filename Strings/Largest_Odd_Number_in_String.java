package Strings;

public class Largest_Odd_Number_in_String {
//    static String largestOddNumber(String num) {
// int num1=num.charAt(0)-'0';
// int num2=num.charAt(num.length()-1)-'0';
// int maxi=Integer.MIN_VALUE;
// String re="";
// if(num.length()==0){
//     return "";
// }
// else if(num1%2!=0 && num2%2!=0){
//     return num;
// }

// else{
// for(int i=0;i<num.length();i++){
//    int temp=num.charAt(i)-'0';
//    if(temp%2!=0){
//     maxi=Math.max(maxi, temp);
//    }
// }
// re+=maxi;
// if(Integer.parseInt(re)==Integer.MIN_VALUE){
//     return "";
// }
// else{
// return re; 
// }
   
// }
 //}
 static String largestOddNumber(String num) {
    for(int i=num.length()-1;i>=0;i--){
        if(num.charAt(i)%2==1){
            System.out.println(num.charAt(i));
            // System.out.println(i);
            return num.substring(0, i+1);
        }
        
    }
    return "";
 }

    public static void main(String[] args) {
        String s="2";
        System.out.println(largestOddNumber(s));
    }
}
