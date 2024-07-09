#include <iostream>
using namespace std;

int main(){
	int t, i, j, k, l, m, n;
	cout << "Masukkan Tinggi (Max. 8)= ";
	cin >> t;
	cout << "--------------------------------"<< endl;
	for(int i=t;i>=2;i--){
		for(int j=i;j>1;j--){
			for(int k=t;k>0;k--){
				cout << " ";
			}
			cout << " ";
		}
		for(int n=0;n<=t-i;n++){
			for(int j=2;j<=i;j++){
				cout << " ";
			}
			for(int k=0;k<=t-i;k++){
				cout << "*";
			}
			cout <<" ";
		}
			
		cout << endl; 
	}
	for(int l=1;l<=t;l++){
			for(int m=t;m>0;m--){
				cout << "*";
			}
			cout << " ";
		}
}
