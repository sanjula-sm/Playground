// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  // Enter your code here 
   char s[1000]; 
  scanf("%[^\t\n]s",s);
  
  int i,st[26]={0},of;
  for(i=0;i<strlen(s);i++)
  {
    if(s[i]>='a' && s[i]<='z')
    {
      of=s[i]-'a'; 
      st[of]++; 
    }
    else if(s[i]>='A' && s[i]<='Z')
    {
      of=s[i]-'A'; 
      st[of]++; 
    } 
  }
  for(i=0;i<26;i++)
  {
    if(st[i]==0)
      printf("%c ",i+'a'); 
  }
      
  
   return 0;
}