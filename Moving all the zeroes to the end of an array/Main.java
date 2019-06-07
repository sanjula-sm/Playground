#include<stdio.h>
int main()
{
  //Type your code here 
  int n; 
  int i,j,k=0; 
  scanf("%d",&n); 
  int a[n]; 
  i=0; j=n-1; 
  for(i=0;i<n;i++)
  { 
    int t; 
    scanf("%d",&t); 
    if(t==0)
    { a[j--]=t;} 
    else
    { a[k++]=t;} 
  } 
  
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
  return 0;
}