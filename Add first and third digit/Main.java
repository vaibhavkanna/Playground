#include<stdio.h>
int main()
{
  int n, first=0, third=0;
  scanf("%d",&n);
  third=n%10;
  first=n/100;
  printf("%d",first+third);
  return 0;
}