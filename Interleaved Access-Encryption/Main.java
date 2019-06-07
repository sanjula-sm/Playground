#include<stdio.h>
#include<string.h>
int main()
{
  // Type your code here 
  char s[10000]; 
  scanf("%s",s); 
  int c; char t[1000][1000]; 
  scanf("%d",&c); 
  int i,j=0,k=0; 
  for(i=0;i<strlen(s); i+=c)
  {
    for(j=0;j<c;j++)
    {
      if(k%2==0)
      {
        if(i+j < strlen(s) )
        {t[k][j]=s[i+j];} 
        else
        {t[k][j]='X';}
      }
      else
      {
      if(i+j < strlen(s))
      {
        t[k][c-j-1]=s[i+j]; 
      } else
       {
         t[k][c-j-1]='X'; 
       }
      } 
    }
    k++;
  } 
  for(i=0;i<c;i++)
  {
    for(j=0;j<k;j++)
    {
      printf("%c",t[j][i]); 
    }
  }
}