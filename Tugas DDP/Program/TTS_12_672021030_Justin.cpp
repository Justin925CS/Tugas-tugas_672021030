#include <iostream>
using namespace std;

int main (){
    string medal;
    string team;
    double total, totalA, totalB;
    float x;
/*Herald 	= H
  Guardian	= G
  Crusader	= C
  Archon	= Ar
  Legend	= L
  Ancient	= An
  Divine	= D
*/
    cout << "Masukkan Nama Tim: ";
	getline (cin, team);
	cout << "Masukkan Medal Tim A : "<<endl;
    for (int i=1; i<= 5; i++){
    cin>>medal; cin.ignore();
    cin>>x;
    float rumus = x/5;
    if (medal.compare("H") == 0){
        total = 1 + rumus - 0.1;
    }
    else if (medal.compare("G") == 0){
        total = 2 + rumus - 0.1;
    }
    else if (medal.compare("C") == 0){
        total = 3 + rumus - 0.1;
    }
    else if (medal.compare("Ar") == 0){
        total = 4 + rumus - 0.1;
    }
    else if (medal.compare("L") == 0){
        total = 5 + rumus - 0.1;
    }
    else if (medal.compare("An") == 0){
        total = 6 + rumus - 0.1;
    }
    else if (medal.compare("D") == 0){
        total = 7 + rumus - 0.1;
    }
    totalA += total;
}
	cout << "Masukkan Medal Tim B : "<<endl;
    for (int j=1; j<= 5; j++){
        cin>>medal; cin.ignore();
        cin>>x;
        float rumus = x/5;
        if (medal.compare("H") == 0){
        total = 1 + rumus - 0.1;
    }
    else if (medal.compare("G") == 0){
        total = 2 + rumus - 0.1;
    }
    else if (medal.compare("C") == 0){
        total = 3 + rumus - 0.1;
    }
    else if (medal.compare("Ar") == 0){
        total = 4 + rumus - 0.1;
    }
    else if (medal.compare("L") == 0){
        total = 5 + rumus - 0.1;
    }
    else if (medal.compare("An") == 0){
        total = 6 + rumus - 0.1;
    }
    else if (medal.compare("D") == 0){
        total = 7 + rumus - 0.1;
    }
        totalB += total;
}
    if (totalA > totalB){
        cout<<"A"<<endl;
    }
    else {
        cout <<"B"<<endl;
    }


    return 0;

}
