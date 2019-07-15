#include<stdio.h>
int main()
{
  	//type your code here
  int s,a[100],m=0,i;
  scanf("%d",&s);
  for(i=0;i<s;i++){
    scanf("%d",&a[i]);
    if (i==0)
      m=a[0];
    if (a[i]>m)
      m=a[i];
  }
  printf("%d",m);
}