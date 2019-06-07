// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here  
  int n; 
  scanf("%d",&n); 
  
  int a[n],i,m,p; 
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]); 
    if(i==0)
    {
      m=a[0]; p=0; } 
    else
    {
      if(a[i]>m){ m=a[i]; p=i; } 
    }
  }
  printf("%d",p);
  
   return 0;
}