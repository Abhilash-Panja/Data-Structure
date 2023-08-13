package Strings;
//s1=abcde
//s2=bat
//op=abbactde
public class Merging_Two_Strings {
    static String Merge(String s1,String s2){
        String re="";
        StringBuffer x=new StringBuffer(re);
        int i=0;
        for( i=0;i<s1.length() && i<s2.length();i++){
          re+=s1.charAt(i);
          re+=s2.charAt(i);
          
        }
        if(i<s1.length()){
           for(int j=i;j<s1.length();j++){
           re+=s1.charAt(j);
           }
        }
        else if (s2.length()>i){
         for(int j=i;j<s2.length();j++){
            re+=s2.charAt(j);
           }
        }
        return re;
    }
    public static void main(String[] args) {
        String s1="abhilash";
        String s2="panja";
        System.out.println(Merge(s1, s2));
    }
}
