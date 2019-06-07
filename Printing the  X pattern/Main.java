#include <stdio.h>
int main() {
	// Type your code here 
    int n; 
    scanf("%d",&n); 
    int i,j; 
    for(i=0;i<=n/2;i++){
      for(j=0;j<n;j++)
      {
        if(j==i || j==n-i-1)
          printf("*"); 
        else
          printf(" "); 
      } 
    printf("\n"); } 
    for(i=(n/2)-1;i>=0;i--)
    {
      for(j=0;j<n;j++)
      {
        if(i==j || j==n-i-1)
          printf("*"); 
        else
          printf(" "); 
      } 
      printf("\n"); 
    } 
  
	return 0;
}