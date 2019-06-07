#include <stdio.h>
void gcd( int a, int b, int c)
{
   int i,g; 
  for(i=1; i<a && i<b && i<c; i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      g=i; 
  } 
  printf("%d",i); 
}
int main() {
	//Type your code here 
    int x,y,z; 
    scanf("%d %d %d",&x,&y,&z); 
    gcd(x,y,z); 
  
	return 0;
}