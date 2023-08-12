public class Move_Zeroes {
    public void moveZeroes(int[] a) {
       int  k=0;
       for (int i=0;i<a.length;i++){
        if(a[i]!=0){
            a[k++]=a[i];
        }
       }
         for (int i=k;i<a.length;i++){
              a[i]=0;
         }
    }
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};
        Move_Zeroes m=new Move_Zeroes();
        m.moveZeroes(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
}
