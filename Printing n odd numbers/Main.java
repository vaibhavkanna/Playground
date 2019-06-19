#include <stdio.h>
int main() {
  int n,x=1;
  scanf("%d",&n);
  printf("%d",x);
	for(int i=2;i<=n;i++)
    {
      printf("\n%d",x+=2);
    }
	return 0;
}