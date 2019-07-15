// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,i;
  scanf("%d%d",&a,&b);
  for(i=a;i>0;i--){
  if ((a%i==0) &&(b%i==0)){
    printf("%d",i);
    goto l;}
  }
  l:
   return 0;
}