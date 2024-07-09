#include <sstream>
#include <iostream> 
#include <conio.h> 
#include <string.h>
using namespace std;

int main()
{
   int i;
   char k[999];
   
   cout << "Program Mengubah String Menjadi Angka."<<endl;
   cout << "--------------------------------------"<<endl;
   cout << "Tuliskan teks \t: "; 
   cin.getline(k,sizeof(k)); 
   cout << "Perubahan \t: "; 
for(i=0;i<strlen(k);i++)
{
 if(k[i]=='a'||k[i]=='A') 
 cout << "1 "; 

 if(k[i]=='b'||k[i]=='B') 
 cout << "2 "; 
 
 if(k[i]=='c'||k[i]=='C') 
 cout << "3 "; 
 
 if(k[i]=='d'||k[i]=='D') 
 cout << "4 "; 

 if(k[i]=='e'||k[i]=='E') 
 cout << "5 "; 
 
 if(k[i]=='f'||k[i]=='F') 
 cout << "6 ";
 
 if(k[i]=='g'||k[i]=='G') 
 cout << "7 "; 

 if(k[i]=='h'||k[i]=='H') 
 cout << "8 "; 
 
 if(k[i]=='i'||k[i]=='I') 
 cout << "9 ";
 
 if(k[i]=='j'||k[i]=='J') 
 cout << "10 "; 

 if(k[i]=='k'||k[i]=='K') 
 cout << "11 "; 
 
 if(k[i]=='l'||k[i]=='L') 
 cout << "12 ";
 
 if(k[i]=='m'||k[i]=='M') 
 cout << "13 "; 

 if(k[i]=='n'||k[i]=='N') 
 cout << "14 "; 
 
 if(k[i]=='o'||k[i]=='O') 
 cout << "15 ";
 
 if(k[i]=='p'||k[i]=='P') 
 cout << "16 "; 

 if(k[i]=='q'||k[i]=='Q') 
 cout << "17 "; 
 
 if(k[i]=='r'||k[i]=='R') 
 cout << "18 ";
 
 if(k[i]=='s'||k[i]=='S') 
 cout << "19 "; 

 if(k[i]=='t'||k[i]=='T') 
 cout << "20 "; 
 
 if(k[i]=='u'||k[i]=='U') 
 cout << "21 ";
 
 if(k[i]=='v'||k[i]=='V') 
 cout << "22 "; 

 if(k[i]=='w'||k[i]=='W') 
 cout << "23 "; 
 
 if(k[i]=='x'||k[i]=='X') 
 cout << "24 ";
 
 if(k[i]=='y'||k[i]=='Y') 
 cout << "25 "; 

 if(k[i]=='z'||k[i]=='Z') 
 cout << "26 ";  
} 
getch();
return 0;
}
