package Recursion;

public class Basic_Recursion_Flow {
//u were assigined to to print the your name five times by creating the function
//but it should be called only once in the main function 
static void m1(){
    System.out.println("Abhilash Panja");
    m2();
} 
static void m2(){
    System.out.println("Abhilash Panja");
    m3();
} 
static void m3(){
    System.out.println("Abhilash Panja");
    m4();
} 
static void m4(){
    System.out.println("Abhilash Panja");
} 
//we are achived program for ment conditions by internal calling the function in the matter
//of the m1() function after printing the print statement and it is called the m2() method ..
public static void main(String[] args) {
    m1();
}
}
