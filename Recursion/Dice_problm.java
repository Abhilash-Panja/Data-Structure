package Recursion;

public class Dice_problm {
    //in place of the String u are given the some sout of the data and u were asked to find 
    //possible way to hit target while we roll the dice
    //we know that dice consisting of the 1,2,3,4,5,6
    //and u provided the target of the 4 
    //while throwing the dice u are able to get the target gerenate the subsets
    static void print(String p,int target){
      if(target==0){
        System.out.println(p);
        return;
      }
      for(int i=1;i<=6 && i<=target;i++){
        print(p+i, target-i);
      }
    }
    public static void main(String[] args) {
        print("", 4);
    }
}
