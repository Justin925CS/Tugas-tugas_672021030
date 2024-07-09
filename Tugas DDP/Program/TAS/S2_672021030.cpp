#include<iostream>
#include<string>
using namespace std;

int main(){
	int jumlah;
	cout<<"Masukkan Jumlah Deret\t\t: ";
	cin>>jumlah;
	int counterF=0;
	int counterB=0;
	string str1 ("Fizz");
	string str2 ("Buzz");
	string str3 ("FizzBuzz");
	cout<<"Masukkan Deret Fizz Buzz\t: "<<endl;
	for (int i=0; i<=jumlah;i++){
		string deret;
		getline(cin,deret);
		if(deret.compare(str1) == 0){
		 counterF = counterF + 1;
		} else if(deret.compare(str2) == 0){
			counterB = counterB + 1;
		} else if(deret.compare(str3) == 0){
			counterF = counterF + 1;
			counterB = counterB + 1;
		}
		}
		cout<<"Nilai F : "<< counterB<<endl<<"Nilai B : "<< counterF;
	}

