#include <iostream> 
#include <cctype> 
#include <cstring>

using namespace std;

int main()
{
	string s;
	cout << "Program Mengubah Huruf Akhir Menjadi Kapital." << endl;
	cout << "---------------------------------------------" <<endl;
	cout << "Masukkan Kalimat/Kata : ";
	while (std::cin >> s){
	s[s.length()-1]=toupper(s[s.length() - 1]);
	cout << s <<" ";
	}
	return 0;	
}
