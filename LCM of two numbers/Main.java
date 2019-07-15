#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,i=1,c=1,t;
  
  scanf("%d\n%d",&a,&b);
  t=a;
 // printf("%d%d",a,b);
  while(c){
  t=a*i;
    if(t%b==0)
      goto l; 
    i=i+1;
    //printf("%d",i);
  }
  l:
  printf("%d",t);
  return 0;
}