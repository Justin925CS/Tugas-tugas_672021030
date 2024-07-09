// Justin Clarence 672021030
#include <iostream>
#include <stdlib.h>    
#include <time.h>  
using namespace std;

int main() {
	srand (time(NULL));
	int angka = (rand() % 100) + 1;
	int jawaban;
	cout << "Permainan Menebak Angka"<< endl;
	cout << "--------------------------------"<< endl;
	do{
		cout << "Masukkan jawaban kamu=";
		cin >> jawaban;
		if (jawaban > angka) { 
		cout << "Jawaban kamu lebih besar" <<endl;
		}
		if (jawaban < angka) { 
		cout << "Jawaban kamu lebih kecil" <<endl;
		}
	}	while (jawaban!= angka);
	
		cout << "Selamat! Jawaban Kamu Benar.";	
	
	return 0;
}
