#include<stdio.h> 
int sum_of_natural(int n)
{
  return (n*(n+1))/2; 
} 
int main() {
    // Type your code here 
   int n; 
  scanf("%d",&n); 
  printf("%d",sum_of_natural(n)); 
  	return 0;
}