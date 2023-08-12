class Solution {
    public void rotate(int [] a,int k) {
	k=k%a.length;
	reverse(a,0,a.length-1);
	reverse(a,0,k-1);
	reverse(a,k,a.length-1);
}
 static void reverse(int[] a, int start, int end) {
	while(start<end) {
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
	}
	
}
}