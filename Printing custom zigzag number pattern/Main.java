#include <stdio.h>
int main() {
	// Type your code here 
    int n,i,j; 
    scanf("%d",&n); 
    for(i=1;i<=n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(i%2==1)
        { 
          if(j==n-1)
            printf("%d",i+1); 
          else
            printf("%d",i); 
        } 
        else
        {
          if(j==0)
            printf("%d",i+1); 
          else
            printf("%d",i); 
        }
      } 
      printf("\n"); 
    }
	return 0;
}