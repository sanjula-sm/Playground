#include <stdio.h>
int main(){
	// Type your code here 
  int n; 
  scanf("%d",&n); 
  int i,j,c=0,v=2; 
  char ch1='#',ch2='*'; 
  for(i=0;i<n;i++)
  {
    if(i==0)
      printf("*\n"); 
    else{ 
      c++; 
    for(j=0;j<=i;j++)
    { 
      if(j%2==0)
        printf("%c",ch1); 
      else
        printf("%c",ch2); 
    } 
      printf("\n"); 
      if(c==2) 
      { v++; char ch=ch1; ch1=ch2; ch2=ch; c=0; } 
    } 
  }
  	return 0;
}