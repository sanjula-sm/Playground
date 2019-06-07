#include <stdio.h>
int main() {
    // Type your code here 
  int i,j,n; 
  scanf("%d",&n); 
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
      printf("%d",i-j+1); 
    printf("\n"); 
  }
	return 0;
}