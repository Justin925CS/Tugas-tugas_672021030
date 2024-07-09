#include <iostream> 
#include <conio.h> 
#include <windows.h> 
using namespace std;

void setcolor(unsigned short color)
{
HANDLE hCon = GetStdHandle(STD_OUTPUT_HANDLE);

SetConsoleTextAttribute(hCon,color);
}

int main(){
mulai:
int t,k,i,j,l,m;

// Menu //
cout<<"TR DDP :"<<endl<<"1. Rumah Pola"<<endl<<"2. Toko FTI"<<endl<<"3. Bendera"<<endl<<"4. Author"<<endl<<"5. Exit"<<endl<<"Pilihan : ";
cin>> m;
getch(); 
switch (m) { 
case 1:

        //Isi program pertama (Rumah Pola)//
getch();
goto mulai;
case 2:

     //Isi program kedua (Toko FTI)//
getch();
goto mulai; 
case 3:
cout << "Masukkan ukuran bendera :";
    cin >> t;
cout << endl;	
	for(int i=2; i>=1; i--){
		for(int i=t; i>=1; i--){
			for(int j=1;j<=i;j++){
				setcolor(6);
				cout << "x ";
			}
        	for(int k=1;k<=t-i;k++){
        		setcolor(9);
				cout << "+ ";
			}
			for(int k=1;k<=t-i;k++){
        		setcolor(9);
				cout << "+ ";
			}
			for(int j=1;j<=i;j++){
				setcolor(6);
				cout << "x ";
			}
			for(int j=1;j<=i;j++){
				setcolor(6);
				cout << "x ";
			}
        	for(int k=1;k<=t-i;k++){
        		setcolor(9);
				cout << "+ ";
			}
			for(int k=1;k<=t-i;k++){
        		setcolor(9);
				cout << "+ ";
			}
			for(int j=1;j<=i;j++){
				setcolor(6);
				cout << "x ";
			}
        cout<<endl;	
		}
	for(int i = 1; i <= t; ++i)
    {
        for(int j = 1; j <= i; ++j)
        {
            setcolor(6);
			cout << "x ";
        }
        for(int k=1;k<=t-i;k++){
        	setcolor(9);
				cout << "+ ";
			}
		for(int k=1;k<=t-i;k++){
        	setcolor(9);
				cout << "+ ";
			}
			for(int j = 1; j <= i; ++j)
        {
            setcolor(6);
			cout << "x ";
        }	
        for(int j = 1; j <= i; ++j)
        {
            setcolor(6);
			cout << "x ";
        }
        for(int k=1;k<=t-i;k++){
        	setcolor(9);
				cout << "+ ";
			}
		for(int k=1;k<=t-i;k++){
        	setcolor(9);
				cout << "+ ";
			}
			for(int j = 1; j <= i; ++j)
        {
            setcolor(6);
			cout << "x ";
        }	
        cout << endl;
    }	
	}
	setcolor(7);
	cout <<endl<< "Tekan ENTER untuk kembali.";
 //Isi program ketiga (Bendera)//
getch();
goto mulai; 
case 4:

 //Isi program keempat (Author)//
getch();
goto mulai; 
case 5:

 //Isi program kelima (Exit)//
getch();
goto mulai;
default: cout<<"\n Tidak Ada Pilihan Tersebut, Silahkan Masukan Pilihan Yang Benar";

goto mulai;
}
getch();
return 0;
}
