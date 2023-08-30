package Recursion;

public class Another_Basic_Recurssion {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    //printing inthe reverse manner
    static void print1(int n){
        if(n==0){
            return;
        }
        print1(n-1);
        System.out.println(n);
    }
    //printing the both
    static void print2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print2(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        //print(5);
        print2(5);
    }
}
