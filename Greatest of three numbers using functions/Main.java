#include <stdio.h>
int greatest(int x,int y ,int z)
{
  if(x>y && x>z)
    return x; 
  else if(y>z)
    return y; 
  else
    return z; }

int main(){
	// Type your code here
    int a,b,c,ans; 
   scanf("%d %d %d",&a,&b,&c); 
   ans=greatest(a,b,c); 
  printf("%d",ans); 
  	return 0;
}