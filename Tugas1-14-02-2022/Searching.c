#include <stdio.h>

int main()
{
	int n, jumlah, i, Data[10], cari;
	printf("Mau input berapa data? ");
	scanf("%d",&n);
	printf("Masukkan %d interger(s)\n",n);
	for(i=0; i<n; i++)
	{
		scanf("%d", &Data[i]);
	}
	printf("Cari angka berapa? ");	
	scanf ("%d", &cari);
	for(i=0; i<n; i++)
	{
		if(Data[i]==cari)
		{
		printf("Angka %d KETEMU, dan tersimpan di lokasi/indeks %d\n", cari, i+1);
		jumlah++;
		}
	}
		if (jumlah==0)
		printf("Angka %d TIDAK DITEMUKAN!\n",cari);
		else
		printf("Angka %d ketemu sebanyak %d kali dalam array\n", cari, jumlah);
	return 0;
}
