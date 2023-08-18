package Strings;
import java.util.*;
public class Minimum_Characters_Added_To_Become_Palindrom {
    /*complex code it would run for few testcases 
    static int minChar(String s) {
        StringBuffer str=new StringBuffer(s);
        int size=s.length();
        int c=0;
        for(int i=0;i<size;i++){
            int index=check(str.toString());
           // System.out.println(index);
            if(index==-1){
                return c;
            }
            else{
                int pos=(str.length()-1)-index;
                //System.err.println(pos);
                str.insert(pos,str.charAt(index));
                c++;
                //System.out.println(str);
            }
        }
        return 0;
     }

    static int check(String s) {
     int start=0;
     int end=s.length()-1;
     while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
         return end;
        }
        else{
        start++;
        end--;
        }
     }

        return -1;
    }*/
     static int minChar(String s) {
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        int size=s.length();
         //System.out.println(size);
       String res="";
       s+="$";
       s+=str.toString();
       res+=s;
       //System.out.println(res);
       int ans=lps(res);
       //System.out.println(ans);
       return (size-ans);
     }
     static   int lps(String s) {
        int []lps=new int[s.length()+1];
        int frist=0;
        int second=2;
       char []n=new char[s.length()+1];
            for(int i=1;i<=s.length();i++){
                int index=i-1;
                n[i]=(char)s.charAt(index); 
            }
           // System.out.println(Arrays.toString(n));
            
            while(second<s.length()+1){
                if(n[frist+1]==n[second]){
                    lps[second]=frist+1;
                    frist++;
                    second++;
                }
                else{
                    //second++;
                    if(frist!=0){
                        frist=lps[frist];
                        //second++;
                    }
                    else
                    {
                        second++;
                    }

                   
                }
            }

            
           //System.out.println(Arrays.toString(lps));
        
           return lps[lps.length-1];
      
    }  
    public static void main(String[] args) {
        String s="abc";
        System.out.println(minChar(s));
    }
}
