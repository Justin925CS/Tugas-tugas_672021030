#include <iostream>

using namespace std;
#define nama "Justin";
#define umur 18;
#define asal "Klaten";
#define hobi "main game";
#define tinggi "179";
#define makanan "Roti Bakar.";

int main()
{
	cout << "Halo perkenalkan nama saya " << nama;
	cout << ", umur saya " << umur;
	cout << " tahun, saya berasal dari " << asal;
	cout << ", hobi saya " << hobi;
	cout << ", tinggi saya " << tinggi;
	cout << "cm, makanan favorit saya " << makanan;
	cout << endl;
	
	int nilai;
	cout << "Masukkan nilai anda: ";
	cin >> nilai;
	if (nilai >= 80){
		cout<<"Anda mendapat nilai A" << endl;
	}
	else if ((nilai >=75) && (nilai < 80)){
		cout<<"Anda mendapat nilai AB" << endl;
	}
	else if ((nilai >=70) && (nilai < 75)){
		cout<<"Anda mendapat nilai B" << endl;
	}
	else if ((nilai >=65) && (nilai < 70)){
		cout<<"Anda mendapat nilai BC" << endl;
	}
	else if ((nilai >=60) && (nilai < 65)){
		cout<<"Anda mendapat nilai C" << endl;
	}
	else if (nilai < 60){
		cout<<"Anda mendapat nilai E" << endl;
	}
	return 0;
}

