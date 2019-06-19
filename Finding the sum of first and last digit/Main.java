#include <stdio.h>
int main() {
	int n,x,y,sum=0;
  scanf("%d",&n);
  x=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  y=n%10;
  sum=x+y;
  printf("%d",sum);  
	return 0;
}