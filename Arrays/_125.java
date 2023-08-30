package Arrays;

public class _125 {
  static boolean isPalindrome(String s) {
      if(s.length()== 1 ) {
        if(s.charAt(0)== ' '){
            return true;
        }
      } 
      s=s.trim();
      if(s.length()==1){
        return true;
      }
      s=s.toLowerCase();
      String s1[]=s.split("\\s+");
      String result="";
      for(int i=0;i<s1.length;i++){
        for(int j=0;j<s1[i].length();j++){
            if(s1[i].charAt(j)>=97 && s1[i].charAt(j) <=122 || s1[i].charAt(j)>=48 && s1[i].charAt(j) <=57 ){
                result+=s1[i].charAt(j);
            }
        }
      }
      System.out.println(result);
       StringBuffer str=new StringBuffer(result);
    //   System.out.println(str.reverse());
      if(str.reverse().toString().equals(result)){
        return true;
      }
      else{
        return false;
      }
  }  
  public static void main(String[] args) {
    String s="0p";
    System.out.println(isPalindrome(s));
  }
}
