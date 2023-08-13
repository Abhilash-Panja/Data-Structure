package Arrays;
//you have provided the range of the numbers ie 1-100
//it means greater than that u didn't consist
public class Sorting_in_Linear {
    static void sort(int [] a){
        int [] n=new int[100];
        for(int i=0;i<a.length;i++){
            int index=a[i]-1;
            n[index]++;
        }
        for(int i=0;i<100;i++){
            if(n[i]==0){
                continue;
                
            }
             System.out.print(n[i]+i+" "); 
          
        }
    }
    public static void main(String[] args) {
      int [] a={20,48,3,8,9,1};  
      sort(a);
    }
}
