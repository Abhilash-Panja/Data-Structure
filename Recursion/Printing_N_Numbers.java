package Recursion;
//u were asked to print the n number
public class Printing_N_Numbers {
  static void numbers(int i){
    if(i==5) return; // base condition
    System.out.println(i);
    i=i+1;
    numbers(i);
  } 
  public static void main(String[] args) {
    numbers(0);
  } 
}
