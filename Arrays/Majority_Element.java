package Arrays;

public class Majority_Element {
 /*morre vooty Algorithm :
for example if we wantted to find the n/k majority element we can contain  k-1 elements 
and we can contain k-1 number of counts also
for example if we wantted to find the n/2 majority element we consist only one number 
bcz we have said that k-1 ie 1
flow:
int e1=Integer.MAX_VALUE;
int c1=0;
for(1---->n):
if(e1==a[i]){
    c1++;
}
else if(c1==0){
    c1=1;
    e1=a[i];
}
->Applying linear Search to  find n/2 majority element
*/
public int majorityElement(int[] nums) {
    int c=0,e1=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        if(e1==nums[i]){
            c++;
        }
        else if( c==0){
            c=1;
            e1=nums[i];
        }
        else{
            c--;
        }
    }

c=0;

for(int i=0;i<nums.length;i++){
    if(nums[i]==e1){
        c++;
    }
}
if(c>nums.length/3){
    return e1;
}
return -1;
}
}
