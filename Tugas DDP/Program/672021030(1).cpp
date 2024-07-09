// Justin Clarence 672021030
#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;

int main() {
	string pilihan,w;
	int i,m=0,h=0,k=0;
	cout << "PROGRAM MENGHITUNG JUMLAH APEL"<<endl;
	cout << "--------------------------------"<< endl;
	cout << "Kode Warna :"<<endl;
	cout << "Apel Merah 	 : merah"<<endl;
	cout << "Apel Merah 	 : hijau"<<endl;
	cout << "Apel Merah Hijau : merah_hijau"<<endl;
	cout << "--------------------------------"<< endl;
	do{
		i++;
		cout << "Masukkan Warna Apel :";
		cin >> w;
		cout << "Masukkan apel lagi (y/n)?";
		cin >> pilihan;
	if(w == "merah" ){
        ++m;
    }
    else if(w == "hijau" ){
        ++h;
    }
    else if(w == "merah_hijau" ){
        ++k;
    }
	}
	while (pilihan.compare("n") != 0) ;

cout<<"Jumlah Semua Apel:"<<endl;
cout<<"Apel Merah 		:"<<m <<endl;
cout<<"Apel Hijau 		:"<<h <<endl;
cout<<"Apel Merah Hijau 	:"<<k <<endl;
getch();
	return 0;
}
