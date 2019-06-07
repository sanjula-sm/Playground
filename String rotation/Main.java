#include<stdio.h>
#include<string.h>
int  Rotation_check(char *st1, char *st2)
{
  int i,j,l1,l2; 
  l1=strlen(st1); 
  l2=strlen(st2); 
  if(l1!=l2)
  { return 0; } 
  else
  { 
    for(i=0;i<strlen(st1)-1;i++)
    {
      char ch=st2[0];
      for(j=0;j<strlen(st1)-1;j++)
      {  st2[j]=st2[j+1]; } 
      st2[j]=ch;
      if(strcmp(st2,st1)==0)
      { return 1; } 
    } 
    return 0;
  } 
    }
int main()
{
  char st1[20], st2[20];
  //Type your code here
  scanf("%s",st1); 
  scanf("%s",st2);
  int h =Rotation_check(st1,st2);
  if(h==1)
    printf("Yes");
  else
    printf("No");
  return 0;
}