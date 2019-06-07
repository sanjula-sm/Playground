#include<stdio.h>
int main()
{
  //fill the code 
  int n; 
  scanf("%d",&n); 
  
  int a[n],i,max; 
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]); 
    if(i==0)
      max=a[0]; 
    else
    {
      if(a[i]>max)
        max=a[i]; 
    }
  }
  printf("%d",max);
  return 0;
}