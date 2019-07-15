#include<stdio.h>
int main()
{
  	//type your code here
  int s,k1,k2,i,a[100];
  scanf("%d",&s);
  for (i=0;i<s;i++)
    scanf("%d",&a[i]);
  scanf("%d%d",&k1,&k2);
  for (i=0;i<s;i++){
  if(a[i]==k1){
    printf("Element 1 index = %d\n",i);
    goto l;
  }
  }
  printf("Element 1 index = %d\n",-1);
  l:
  for (i=0;i<s;i++){
  if(a[i]==k2){
    printf("Element 2 index = %d\n",i);
    return 0;
  }}
  printf("Element 2 index = %d\n",-1);
  return 0;
}