#include<stdio.h>
int main()
{
  //Type your code here
  int d,b[1000],r,i=0,j;
  scanf("%d",&d);
  while (d>0){
    b[i]=d%2;
    d=d/2;
    i++;
  }
  for (j=i-1;j>=0;j--)
    printf("%d",b[j]);
  return 0;
}