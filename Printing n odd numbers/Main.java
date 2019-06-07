#include <stdio.h>
int main() {
	//Type your code
  int n; 
  scanf("%d",&n);
  int i=1,count=0;
  for(i=1;count<n;i+=2)
  {
    if(i%2!=0){
      printf("%d",i);
      count++; }
    printf("\n"); 
  }
    
	return 0;
}