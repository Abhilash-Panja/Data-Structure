package Recursion;

public class Skiping_String {
    static String Skip(String s){
        if(s.isEmpty()){
            return " ";
        }    
        if(s.startsWith("apple")){
            return Skip(s.substring(5));
        }
        else{
            return s.charAt(0)+Skip(s.substring(1));
        }

    }
    //removing the app when it is not the apple
   static String Skip1 (String s){
        if(s.isEmpty()){
            return " ";
        }    
        if(s.startsWith("app") && !(s.startsWith("apple"))){
            return Skip1(s.substring(3));
        }
        else{
            return s.charAt(0)+Skip1(s.substring(1));
        }

    }
   
    public static void main(String[] args) {
        String s="bcsdapplekk";
        System.out.println(Skip1(s));
    }
}
