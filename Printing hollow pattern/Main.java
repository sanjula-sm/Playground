#include <stdio.h>
int main() {
	// Type your code here 
    int n; 
  scanf("%d",&n); 
  int i,j; 
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==0 || i==n-1)
        printf("*"); 
      else
      {
        if(j==0 || j==n-1)
          printf("*"); 
        else
          printf(" "); 
      } 
    } 
    printf("\n"); 
  } 
	return 0;
}