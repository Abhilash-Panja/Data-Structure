package Arrays;

class Solution {
    public int singleNumber(int[] a) {
      int unique=0;
for(int i=0;i<a.length;i++) {
	unique^=a[i];
}

return unique ;

    }
}