#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char a[100];
  scanf("%s",a);
  int i,j,t=1;
  for(i=0;a[i]!='\0';i++);
  if (i>20)
    printf("Invalid Input");
  else{
    for(j=0;j<i;j++){
    if(a[j]==a[j+1])
      t++;
    else{
      printf("%c%d",a[j],t);
      t=1;}
    }
  }
}