#include <stdio.h>
int main() {
	// Type your code here 
  int i,j,n,k; 
  scanf("%d",&n); 

  for(i=1;i<=n;i++)
  {
    for(j=1;j<(n-i+1); j++)
      printf(" "); 
    for(k=1;k<(2*i);k++)
      printf("*"); 
    printf("\n");
  }
	return 0;
}