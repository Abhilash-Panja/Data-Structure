package Recursion;

public class Patterns {
    static void Reverse_trinagle(int r,int c){
        if (r==0) {return;}
       if(c<r){
        System.out.print("*");
        Reverse_trinagle(r, c+1);
          
       }
       else{
       System.out.println();
       Reverse_trinagle(r-1, 0);
    }
        
    }
    static void Normal_trinagle(int r,int c){
       if (r==0) {return;}
       if(c<r){ 
       Normal_trinagle(r, c+1);
        System.out.print("*");   
       }
       else{ 
       Normal_trinagle(r-1, 0);
       System.out.println();
    }
        }
        
        
    
    public static void main(String[] args) {
        Reverse_trinagle(4, 0);
        Normal_trinagle(4, 0);
    }
}
