#include <iostream>
#include <cctype> 
#include <cstring>
using namespace std;

int main(){
    string kata;
    int n, i;
    bool palindrome = true;
 
    cout << "Program Mengecek Kata - Kalimat Palindrom atau Bukan" << endl;
	cout << "----------------------------------------------------" <<endl;
    cout << "Input Kata/Kalimat \t: ";
    getline(cin, kata);
    n = kata.length();

    for(i = 0; i < n; i++){
        if(kata[i] != kata[n-i-1])
        {
            palindrome = false;
            break;
        }
    }

    cout << "Result \t\t\t: ";
    if(palindrome == true)
        cout << "Palindrom";
    else
        cout << "Bukan Palindrom";

    cin.ignore();
    return 0;
}
