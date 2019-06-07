#include <stdio.h>
int main() {
	//Type your code 
  int n; 
  scanf("%d",&n); 
  int i,sum=0; 
  /*for(i=1;i<=n;i++)
  { sum+=i;} 
  */ 
  i=n*(n+1); 
  printf("%d",i/2); 
	return 0;
}