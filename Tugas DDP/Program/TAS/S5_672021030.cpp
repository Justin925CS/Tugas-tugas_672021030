#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	int score;
	cout<<"Masukkan Skor : ";
	cin>>score;
	cout<<"-------------------------------------------------"<<endl;
	cout<<"|\t\t   SCORE BOARD\t\t\t|"<<endl;
	cout<<"-------------------------------------------------"<<endl;
	cout<<"|\t5\t|\t3\t|\t2\t|"<<endl;
	cout<<"-------------------------------------------------"<<endl;
	for(int i=0; i<score; i++){
		for(int j=0; j<score-i; j++){
			for(int k=0; k<score-i-j; k++){
				if((i*5)+(j*3)+(k*2)==score)
				cout<<"|\t"<<i<<"\t|\t"<<j<<"\t|\t"<<k<<"\t|"<<endl;
			}
		}
	}
	cout<<"-------------------------------------------------";
}
