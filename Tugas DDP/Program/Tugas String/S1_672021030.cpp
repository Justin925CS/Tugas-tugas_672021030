#include <iostream> 
#include <cctype> 
#include <cstring>

using namespace std;
int main(void)
{
   char teks[30], teks_baru[30];
   
   cout << "Program Mengubah Semua Huruf Menjadi Kapital."<<endl;
   cout << "---------------------------------------------"<<endl;
   cout << "Tuliskan teks \t: "; 
   std::cin.getline(teks, 30);

   for (int i=0; i<strlen(teks); i++) {
        teks_baru[i] = toupper(teks[i]);      
   }

   cout << "Perubahan \t: " << teks_baru << endl;

   return 0;   
}
