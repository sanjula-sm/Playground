#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here 
  int f=0,i,j,t1=-1,t2=-1; 
  for(i=0;i<size;i++)
  {
    f=0; 
    for(j=i+1;j<size;j++)
    { 
      if(arr[i]+arr[j]==sum)
      { t1=arr[i]; t2=arr[j]; f=1; break; 
      } 
    } 
    if(f==1)
      break; 
  } 
  if(f==1)
    printf("Perfect couple: %d %d",t1,t2);
  else
    printf("No perfect couple found!");
}