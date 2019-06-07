#include<stdio.h>
int main()
{
  //Type your code here
  int n; 
  scanf("%d",&n); 
  
  int a[n],i,n1,n2,i1=-1,i2=-1; 
  for(i=0;i<n;i++)
    scanf("%d",&a[i]); 
  scanf("%d %d",&n1,&n2);
  for(i=0;i<n;i++)
  {
    if(a[i]==n1)
      i1=i; 
    if(a[i]==n2)
      i2=i; 
  } 
  printf("%d\n%d",i1,i2);
  return 0;
}