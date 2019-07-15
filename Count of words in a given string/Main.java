#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int i,l=0;
  char c[500];
  gets(c);
  for(i=0;i<strlen(c);i++){
  if (c[i]==' ')
    l+=1;
  }
  printf("%d",l+1);
  return 0;
}