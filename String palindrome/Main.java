#include<stdio.h>
int main()
{
  //Type your code here 
  char t[1000]; 
  scanf("%s",t); 
  
  int i,j,len; 
  len=strlen(t); 
   i=0; 
  j=len-1; 
  while(i<=j)
  {
    if(t[i]!=t[j])
    { break; } 
    j--; i++;
  } 
  
  if(i<j)
    printf("%s is not a palindrome",t); 
  else
    printf("%s is a palindrome",t); 
 
  return 0;
}