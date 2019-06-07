#include <stdio.h>
int main() {
	// Type your code here 
  int i,j,k,n,v=1; 
  scanf("%d",&n); 
  for(i=1;i<=n;i++)
  {
    for(j=0;j<=(n-i-1);j++)
      printf(" "); 
    for(k=1;k<=i;k++)
      printf("%d ",v++); 
    printf("\n"); 
  } 
	return 0;
}