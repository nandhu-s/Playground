#include <stdio.h>
#include<ctype.h>
int main() {
	// Type your code here
	
  char c;
  scanf("%c",&c);
  if (isupper(c)){
    printf("%c",tolower(c));}
  else{
    printf("%c",toupper(c));}
  return 0;
}