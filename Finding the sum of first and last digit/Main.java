#include <stdio.h>
int main() {
	//Type your code 
  long long int n; 
  scanf("%lld",&n); 
  
  int a[1000],i; 
  i=0; 
  while(n>0)
  {
    a[i]=n%10; 
    n/=10; 
    i++; 
  } 
  n=i; 
  printf("%d",a[0]+a[n-1]);
	return 0;
}