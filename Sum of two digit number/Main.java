#include<stdio.h>
int main()
{
  int a,s;
  scanf("%d",&a);
  s=a%10;
  a=a/10;
  
  
  printf("%d",a+s);
  return 0;
}