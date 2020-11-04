#include<stdio.h>

int main()
{ 
  int x = 10;
  static int y = 10;
   if(x == y){
     printf("Equal");
  }
  else if(x > y){
     printf("Greater");
  }
  else{
     printf("Lesser");
  }
  return 0; 
}



