package Recursion;

public class Finding_Sub_Sets_With_Ascii_Values {
    static void task(String p,String up,int asci){ 
        if(up.isEmpty()){
            System.out.println(p+" "+asci);
            return;
        }
        task(p+up.charAt(0), up.substring(1), up.charAt(0)+0);
        task(p, up.substring(1), asci);
    }
    public static void main(String[] args) {
        task("", "abc", 0);
    }
}
