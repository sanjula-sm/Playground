#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here 
  char st[1000][1000],sr[1000],ds[1000]; 
  int i=0,l; 
  char ch;
  do{
    char s[1000]; 
    scanf("%s%c",s,&ch); 
    strcpy(st[i],s); 
   i++; 
  } while(ch!='\n'); 
  l=i; 
  scanf("%s",sr); 
  scanf("%s",ds); 
  for(i=0;i<l;i++)
  { 
    
    if(strcmp(st[i],sr)==0)
      strcpy(st[i],ds); 
    printf("%s ",st[i]);
  } 
  
 
  
  return 0;
}