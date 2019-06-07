#include <stdio.h>
int main() {
	//Type your code 
    long long int s;  
  scanf("%lld",&s); 
  int a[1000],i=0; 
  while(s>0)
  {
    a[i]=s%10; s/=10; 
    i++;
  }
   s=i; 
  printf("%d",a[s-2]); 
	return 0;
}