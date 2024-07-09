#include <iostream>
using namespace std;

int main(){
  int flag=0;
  int max=22;
  for(int x=1; x<=6 ; x++){
      for(int y=x ; y>1 ; y--){
        cout<<"\t";
    }
    for(int z=1; z<=22 ; z++){
 
      if(flag==0){
        if(z%2==0 && z<=max){
          cout<<"\t" <<z;
        }
      }
      else{
        if(z%2 == 1 && z<=max){
          cout<<"\t"<< z;
        }
      }
    }
    if(flag==1){
      max -= 3;
      flag=0;
    }
    else{
      max -= 5;
      flag=1;
    }
    puts("");
  }
}
