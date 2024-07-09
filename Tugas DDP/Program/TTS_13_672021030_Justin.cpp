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
         n = n + total;
         totalsks = totalsks + sks;
    }

    h = n / totalsks;
    cout<<h<<endl;

    return 0;
}
