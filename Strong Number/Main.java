#include <stdio.h> 
int fact (int n)
{
  int i=1,f=1; 
  for(i=1;i<=n;i++)
    f*=i; 
  return f; 
} 
int main() {
	//Type your code 
    long long int n,a;
    scanf("%lld",&n); 
    long int s=0; 
     a=n; 
    while(n>0)
    {
      s+=fact(n%10); 
      n/=10; 
    } 
    if(a==s)
      printf("Yes"); 
  else 
    printf("No"); 
	return 0;
}