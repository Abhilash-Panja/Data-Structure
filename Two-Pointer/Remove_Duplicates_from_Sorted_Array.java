class Solution {
    public int removeDuplicates(int[] a) {
       int i=0,j=1;
        while(i<a.length && j <a.length){
            if(a[i]==a[j]){
                j++;
            }
            else{
                a[++i]=a[j];
            }
            
        }
        return i+1;
    }
}