package Strings;

public class Longest_Palindrom_String {
    static String longestPalindrome(String s) {
        String [] ss=new String[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s1=s.substring(i, j);
                StringBuffer str=new StringBuffer(s1);
                str.reverse();
                System.out.println(s1);
                if(str.toString()==s1){
                return s1;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}