#include<stdio.h>

int main()
{
  // Type your code here
  int a,b,c,d,m;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  m=a;
  if (b<m)
    m=b;
  if(c<m)
    m=c;
  if(d<m)
    m=d;
  printf("%d",m);
}