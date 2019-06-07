#include <stdio.h> 
#include <math.h>
int main() {
	//Type your code 
    long int n,an; 
  long int s=0; 
  scanf("%d",&n); 
  int a[1000],i=0; 
  an=n; 
  while(n>0)
  {
    a[i]=n%10; 
    n/=10; 
    i++; 
  } 
  n=i; 
  for(i=0;i<n;i++){
    s+=pow(a[i],n); 
  } 
  if(an==s)
  printf("Armstrong Number");  
  else
    printf("Not an Armstrong Number");
	return 0;
}