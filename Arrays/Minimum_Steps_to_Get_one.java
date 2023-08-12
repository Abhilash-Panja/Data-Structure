package Arrays;

public class Minimum_Steps_to_Get_one {
   static int minSteps(int [] a) {
   int count=0;
   int zero_count=0;
   int mul=1;
   for(int i=0;i<a.length;i++){
    if(a[i]>0){
        count+=a[i]-1;
     mul=mul*1;
    }
else if(a[i]<0){
        count+=(-1-a[i]);
        mul=mul*(-1);
    }
    else if(a[i]==0){
        zero_count++;
    }
   }
   if(mul==1 || zero_count>0){
       return count;
}
else{
    return count+2;}}
    
}