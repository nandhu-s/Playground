#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[99]={0,1},i,j;
  for (i=2;i<n;i++){
  a[i]=a[i-1]+a[i-2];
  }
  for (j=0;j<n;j++)
    printf("%d ",a[j]);
  return 0;
}