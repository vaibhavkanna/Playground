#include <stdio.h>
int main() {
	int n,temp,sum=0,f=1,rem=0,i;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    rem=temp%10;
    for(i=1;i<=rem;i++)
    {
      f=f*i;
    }
    temp=temp/10;
    sum=sum+f;
    f=1;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
  
    
	return 0;
}