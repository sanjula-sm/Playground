#include<stdio.h>
int isprim(int n)
{
  int i; 
  for(i=2;i<n;i++)
  {
    if(n%i==0)
      break; 
  } 
  if(i==n)
    return 1; 
  return 0; }

int main(){
    // Type your code here 
    int n; 
  scanf("%d",&n); 
  int i; 
  for(i=2;i<n;i++)
  {
    if(isprim(i))
      printf("%d\n",i); 
  } 
    return 0;
}