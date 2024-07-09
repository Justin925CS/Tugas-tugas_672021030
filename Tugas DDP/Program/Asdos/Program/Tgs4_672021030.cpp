#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

int main()
{
    int a, b;
    char k;
    int kode;
    
	menu: 
    cout<<"================================="<<endl;
    cout<<"KALKULATOR SEDERHANA PAKAI FUNGSI"<<endl;
    cout<<"================================="<<endl;
    
    
    cout<<endl<<"Masukan bilangan pertama = ";
    cin>>a;

    cout<<endl<<endl<<"Pilih kode"<<endl<<"1.Tambah"<<endl<<"2.Kali"<<endl<<"3.Bagi"<<endl<<"4.Kurang"<<endl<<"Masukan Kode = ";
    cin>>kode;
    cout<<endl;
    
    apa :
    if(kode==1||kode==2||kode==3||kode==4){
    goto bil;
        }
        else{
        goto lagi;
    }

    bil : 
    cout<<endl<<"masukan bilangan kedua = ";
    cin>>b;
    
    cout<<endl;
       if (kode==1){
    cout<<"Hasil penambahan = ";
    cout<<a+b;}
      else if (kode==2){
    cout<<"Hasil kalinya = "<<a*b;}
       else if (kode==3){
    cout<<"Hasil baginya = "<<a/b<<endl; 
	cout<<"Sisa = "<<a%b;}
       else if (kode==4){
    cout<<"Hasil pengurangan = "<<a-b;}
        else{     
    cout<<"salah";
        }
        
    cout<<endl<<endl<<"Mau coba lagi ? (y/t)";
    cin>>k;
    cout<<endl;
	if(k=='Y'||k=='y')
    {
        goto menu;
    }
    
    if(k=='T'||k=='t')
    {
        goto akhir;
    }
    
lagi :
    cout<<"Masukan anda salah, masukan lagi = ";
    cin>>kode;
    goto apa;
akhir :
    cout<<"=================================";

 }    
