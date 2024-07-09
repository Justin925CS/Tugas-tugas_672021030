#include <iostream>
#include <cmath>

using namespace std ;

void selisih_min( int *a , int b){
        int selisih , min[b], f;

        for( int i = 0 ; i < b ; i++){
            f = a[i];
            selisih = abs(f - a[ i+1 ]);
            for( int j = i+1; j < b-1 ; j++){
                if(selisih > abs((f - a[j]))){
                    selisih = abs(f - a[j]);
                }
            }
            min[i] = selisih;
        }

        int hasil;
        hasil =  min[0];

        for( int i = 0 ; i < b ; i++){
            if( hasil > min[i]){
                hasil = min[i];
            }
        }
        cout << "Selisih Kekuatan Terkecil : " <<  hasil << endl;

        cin.get();
    }

int main(){
    int n, m = 0;
    cout<<"Masukkan Jumlah Kuda\t: ";
	cin >> n;
    int s[n];
    cout<<"Masukkan Kekuatan Kuda\t: "<<endl;
    for( int i = 0 ; i < n ; i++){
        cin>>s[i];
    }
    selisih_min(s,n);
    m++;

    return 0;
}
