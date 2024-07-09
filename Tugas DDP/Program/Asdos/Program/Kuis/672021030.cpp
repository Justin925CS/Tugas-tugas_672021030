#include <iostream>
using namespace std;

int main (){
    double t, sks, n, totalsks, h, total;
    cout << "Masukkan jumlah matakuliah: ";
    string kat;
    cin>>t;
    cout << "Masukkan nilai dan jumlah sks: "<<endl;
    for (int i=1; i<=t; i++){

        cin>>kat; cin.ignore();
        cin>>sks;
        if (kat.compare("A") == 0){
            total = sks * 4;
        }
        else if (kat.compare("AB") == 0){
            total = sks * 3.5;
        }
        else if (kat.compare("B") == 0){
            total = sks * 3.0;
        }
        else if (kat.compare("BC") == 0){
            total = sks * 2.5;
        }
        else if (kat.compare("C") == 0){
            total = sks * 2.0;
        }
        else if (kat.compare("CD") == 0){
            total = sks * 1.5;
        }
        else if (kat.compare("D") == 0){
            total = sks * 1.0;
        }
        else if (kat.compare("E") == 0){
            total = sks * 0.0;
        }
         n = n + total;
         totalsks = totalsks + sks;
    }

    h = n / totalsks;
    cout<<h<<endl;

    return 0;
}
