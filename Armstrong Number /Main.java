#include <stdio.h>
#include<math.h>
int main() {
	int arm,size,i,temp=0,sum=0,rem=0;
  scanf("%d",&arm);
       temp=arm;
        while(temp>0)
        {
          temp=temp/10;
            size++;
        }
  temp=arm;
       for(i=0;i<size;i++)
       {
         rem= temp%10;
          sum= sum + pow(rem,size);
         temp=temp/10;
       }
  if(arm==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
         return 0;
}