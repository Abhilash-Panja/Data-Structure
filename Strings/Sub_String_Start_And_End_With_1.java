package Strings;

public class Sub_String_Start_And_End_With_1 {
    static long binarySubString(String s){
     long c=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1'){
            c++;
           }
        }
        //ncr=n!/r!(n-r)!
        c=(c*(c-1))/2;
     return c;
    }
    public static void main(String[] args) {
        String s="10001001";
        System.out.println(binarySubString( s));
    }
}
