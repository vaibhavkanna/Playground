#include <stdio.h>
int main() {
	int i,n,x,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    x=n%10;
    sum+=x;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}