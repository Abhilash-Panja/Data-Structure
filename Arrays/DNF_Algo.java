package Arrays;

public class DNF_Algo {
    public void sortColors(int[] a) {
        int start=0,mid=0,end=a.length-1;
        while(mid<=end){
            switch(a[mid]){
                case 0:
                    swap(a,mid,start);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a,mid,end);
                    //mid++;
                    end--;
                    break;
            }
        }
        
    }
    void swap(int [] a,int start,int end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        } 
}
