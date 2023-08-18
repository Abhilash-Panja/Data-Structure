package Strings;

public class check_Is_stringRotated {
    //optimized code:
   /*  static boolean isRotated(String s1, String s2)
    {
        if(s1.length()!=s2.length()){
            return false;
        }
        boolean clock_r=true,a_clock=true;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=(s2.charAt((i+2)%s1.length()))){
                clock_r= false;
                break;
            }
        }
       // System.err.println(clock_r);
        for(int i=0;i<s1.length();i++){
            if((s1.charAt((i+2)%s1.length()))!=s2.charAt((i))){
                a_clock= false;
                break;
            }
        }
        //System.out.println(a_clock);

        return (clock_r || a_clock);
        
    }*/
    //little complex
    static boolean isRotated(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==1){
            if(s1.charAt(0)==s2.charAt(0)){
                 return true;
            }
           else{
               return false;
           }
        }
        String res="";
        s1+="$";
        res=s1+s2;
    int index=lps(res);
    //System.out.println(index);
    if(s2.length()-index==4||s2.length()-index==2||index==2||index==4){
        return true;
    }
    else{
        return false;
    }
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
                    if(frist!=0){
                        frist=lps[frist];
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
    


    String s1="rellnmpapqfwkhop";
   // System.err.println(s1.length());
    String s2= "llnmpapqfwkhopre";
    System.out.println(isRotated(s1,  s2));
}
        
}
