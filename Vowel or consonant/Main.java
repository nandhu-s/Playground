#include<stdio.h>
#include<string.h>
int main()
{
  //type your code here
  int i,ch=0,j;
  char v[]={'a','e','i','o','u','A','E','I','O','U'},ip;
  scanf("%c",&ip);
  for(i=0;i<10;i++){if(v[i]==ip)
      ch=1;
  }
  if (ch==1)
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}