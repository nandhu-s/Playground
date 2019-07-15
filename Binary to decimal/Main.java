#include<stdio.h>
int main()
{
  //Type your code here
  int d[100],i,j=0,t=10,sum=0,k=0;
  char b[1000];
  scanf("%s",&b);
  //printf("%s\n",b);
  for (i=strlen(b)-1;i>=0;i--){
    if (b[i]=='1'){
        d[j]=pow(2,k);
      //printf("%d\n",d[j]);
    j++;
      //printf("%d",j);
    }
  k+=1;
  }
  //printf("%d",j);
  for (i=0;i<j;i++){
   sum=sum+d[i];
     //printf("%d",sum);
   }
  printf("%d",sum);
  return 0;
}