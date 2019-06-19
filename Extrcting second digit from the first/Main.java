#include <stdio.h>
int main() {
	int n, x;
  scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  x=n%10;
  printf("%d",x);
	return 0;
}