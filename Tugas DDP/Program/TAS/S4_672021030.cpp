#include <iostream>
#include <conio.h>
using namespace std;

void satuan (long n)
{
if (n==1) {
cout<<" Satu ";
}
else if (n==2) {
cout<<" Dua ";
}
else if (n==3) {
cout<<" Tiga ";
}
else if (n==4) {
cout<<" Empat ";
}
else if (n==5) {
cout<<" Lima ";
}
else if (n==6) {
cout<<" Enam ";
}
else if (n==7) {
cout<<" Tujuh ";
}
else if (n==8) {
cout<<" Delapan ";
}
else if (n==9) {
cout<<" Sembilan ";
}
else if (n==10) {
cout<<" Sepuluh ";
}
else if (n==11) {
cout<<" Sebelas ";
}
}
void terbilang (long o)
{
if (o<=11) {
satuan(o);
}
else if ((o>11) && (o<=19)) {
terbilang(o%10);
cout<<"Belas ";
}
else if ((o>=20)&&(o<=99)) {
terbilang(o/10);
cout<<"Puluh";
terbilang(o%10);
}
else if ((o>=100)&&(o<=199)) {
cout<<"Seratus";
terbilang(o%100);
}
else if ((o>=200)&&(o<=999)) {
terbilang(o/100);
cout<<"Ratus";
terbilang(o%100);
}
else if ((o>=1000)&&(o<=1999)) {
cout<<"Seribu";
terbilang(o%1000);
}
else if ((o>=2000)&&(o<=10000)) {
terbilang(o/1000);
cout<<"Ribu";
terbilang(o%1000);
}
else if ((o>10000))
{
cout<<"maaf! angka yang kamu masukan terlalu banyak";
}
}
int main()
{
int nilai;

cout<<"Masukan Bilangan : ";cin>>nilai;
if (nilai<0){
cout<<"Minus ";
terbilang(nilai);
} else {
terbilang(nilai);
}
getch();
}
