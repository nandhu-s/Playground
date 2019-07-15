#include<stdio.h>
int main()
{
  //Type your code here
  int k,s,a[100],i;
  scanf("%d",&s);
  
  for (i=0;i<s;i++)
    scanf("%d",&a[i]);
  
  scanf("%d",&k);
  
  for (i=0;i<s;i++){
  if (a[i]==k){
    printf("%d",i+1);
    return 0;}
  }
  
  printf("%d isn't present in the array.",k);
  return 0;
}