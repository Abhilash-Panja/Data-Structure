package Strings;
//s1=bcadeh
//s2=hea
//how many least chartcer should be removed to make the anagram
public class Making_Angarams {
  static  int remAnagram(String s1,String s2){
        int c=0;
        int [] n=new int[26];
        for(int i=0;i<s1.length();i++){
          int index=s1.charAt(i)-'a';
          n[index]++;
        }
        int [] x=new int[26];
        for(int i=0;i<s2.length();i++){
          int index=s2.charAt(i)-'a';
          x[index]++;
        }
        for(int i=0;i<26;i++){
            if(s1.length()>s2.length()){
             c+=n[i]-x[i];
            }
            else{
                c+=x[i]-n[i];
            }
            
        }
        return c;
    }
    public static void main(String[] args) {
        String s1="cddgk";
        String s2="gcd";
        System.out.println(remAnagram(s1,s2));
    }
}
