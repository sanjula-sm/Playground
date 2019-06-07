#include<stdio.h>
int main()
{
  //Type your code here
  int n; 
  scanf("%d",&n); 
  
  int arr[n],occ[100]={0},i;
  for(i=0; i<n; i++)
  {
     scanf("%d",&arr[i]); 
     occ[arr[i]-1]++; 
  } 
  for(i=0; i<n;i ++)
  {
    if(occ[i]==0)
      printf("%d",i+1); 
  } 
  return 0;
}