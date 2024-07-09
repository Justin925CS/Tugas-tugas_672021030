#include <iostream>
using namespace std;

int main(){
	int i,j,k,l,s;
	for (int i=1;i<=3;i++){
		for (int j=1;j<=i;j++){
			cout << i;
		}
		cout << endl;		
	}
	cout << endl;	
	for(i = 1; i <= 4; i++){
		for(s = 4; s > i; s--)
			cout << " ";
		for(j=1; j<=2*i-1; j++)
			cout << j;
		cout << endl;
	}
	for(i = 3; i > 0; i--){
		for(s = i; s <= 3; s++)
			cout << " ";
		for(j = 1; j <= 2*i-1; j++)
			cout << j;
	cout << endl;
	}  
    cout << endl;
    for(i = 1; i <= 4; i++){
		for(s = 4; s > i; s--)
			cout << "  ";
		for(j=1; j<=i; j++)
			cout << j<<"   ";
		cout << endl;
	}
	for(i = 3; i > 0; i--){
		for(s = i; s <= 3; s++)
			cout << "  ";
		for(j = 1; j <= i; j++)
			cout << j<<"   ";
	cout << endl;
	}
}



