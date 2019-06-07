#include<stdio.h>
int main()
{
  //Type your code here 
  int n,f,t; 
  scanf("%d",&n); 
  f=n%10; 
  t=(n/100)%10;
  printf("%d",f+t);
  return 0;
}