class Check_if_Array_Is_Sorted_and_Rotated {
boolean check(int[] a) {
      int k=0;
      for(int i=0;i<a.length;i++) {
/* manaku question lo am echadu anta array sorted lo undali and
rotate ayii undali.
manam oka rotate ayyina array chudam 4,5,1,2,3
e array two times rotate ayindhi + sorted lo kuda undhi
manam array nu observe chastha oka dhagara matrama a[i]>a[i+1]
ani untundhi ie 5 > 1
manam a[(i+1)%a.length] ani andhuku theskunam anta look at this test case
[4,5,1,2,3,5] manam normal ga ela check chastha a[i]>a[i+1]
look when i=a.length-1; just manam dhanii ignore chastham bcz i+1<a.length ani
condition padutham
appuditha manam array nu rotate chasi chusthamo appudu adhi ela untundhi
1,2,3,5,4,5 so array sorted lo ledhu
manam a[(i+1)%a.length] use chastha 
if i=5;
if(a[i]>a[(i+1)%a.length]
anta a[5]=5
a[(5+1)%6)]=ie a[0] in case adhi a[0] kanta akuva unta mana k++ avuthdhi so 
k value 2 avvudhi

*/
    	  
    	  if( a[i]>a[(i+1)%a.length]) {
    		  k++;
    	  }
    	  if(k>1) {
    		  return false;
    	  }
      }
      return true;
    }
}