#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int jumlah;
	int x=100;
	cout<<"Masukkan Jumlah Suhu Yang Dihitung\t: ";
	cin>>jumlah;
	cout<<"Masukkan Suhu\t\t\t\t: "<<endl;
	for (int i=0; i<jumlah;i++){
	int s;	
	cin>>s;	
	if (abs(s) < abs(x) || abs(s) == abs(x) && s > x) {
      x = s;
    }	
	}
	if(x == 0){
		cout<<"Suhu Yang Paling Mendekati 0\t\t: "<< 0 <<endl;
	}
	else {
		cout<<"Suhu Yang Paling Mendekati 0\t\t: "<< x <<endl;
	}
}
