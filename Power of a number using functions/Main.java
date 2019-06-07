#include<stdio.h> 

long long  int power(int b,int e){
  int i;
  long int v=1; 
  for(i=0;i<e;i++)
  {
    v=v*b; 
  } 
  return v; 
} 
int main(){
    // Type your code here
  int base,exp; 
  scanf("%d %d",&base,&exp); 
  long long int a=power(base,exp); 
  printf("%lld",a);
  	return 0;
}