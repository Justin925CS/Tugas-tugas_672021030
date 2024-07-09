#include <iostream> 
#include <conio.h> 
#include <string.h>
using namespace std;

int main() 
{ 
int i,n; 
char k[100];
cout << "Program Menghitung Jumlah Huruf Vokal." << endl;
cout << "--------------------------------------" <<endl;
cout<<" Masukkan Kata/Kalimat \t= ";
cin.getline(k,sizeof(k)); 
n=0; 
for(i=0;i<strlen(k);i++)
{
 if(k[i]=='a'||k[i]=='i'||k[i]=='u'||k[i]=='e'||k[i]=='o'||k[i]=='A'||k[i]=='I'||k[i]=='U'||k[i]=='E'||k[i]=='O') 
 n++; 
} 
cout<<" Jumlah huruf vokal \t= "<<n<<endl;
getch();
return 0;
 }
