// Monica Yoshe Dhinora 672021032
#include <iostream>
using namespace std;

struct barang {
    int id, hb, count = 0;
    string nb;
};

int main() {

	cout << "\t  ______________________________________________   \n" ;
	cout << "\t |                                              |  \n" ;
	cout << "\t |       Daftar dan Harga Barang Toko FTI       |  \n" ;
	cout << "\t |-----+-------------------------+--------------|  \n" ;
	cout << "\t | ID  | Nama Barang             | Harga Barang |  \n" ;
	cout << "\t |-----+-------------------------+--------------|  \n" ;
	cout << "\t | 1.  | Flashdisk Toshiba 4 GB  | Rp. 50000    |  \n" ;
	cout << "\t | 2.  | Flashdisk Toshiba 8 GB  | Rp. 65000    |  \n" ;
	cout << "\t | 3.  | Flashdisk Toshiba 16 GB | Rp. 90000    |  \n" ;
	cout << "\t | 4.  | Flashdisk Toshiba 32 GB | Rp. 110000   |  \n" ;
	cout << "\t | 5.  | Flashdisk Sandisk 4 GB  | Rp. 75000    |  \n" ;
	cout << "\t | 6.  | Hard Disk WD 500 GB     | Rp. 700000   |  \n" ;
	cout << "\t | 7.  | Hard Disk WD 1 TB       | Rp. 900000   |  \n" ;
	cout << "\t | 8.  | Hard Disk Dell 500 GB   | Rp. 670000   |  \n" ;
	cout << "\t | 9.  | Hard Disk Dell 1 TB     | Rp. 800000   |  \n" ;	
	cout << "\t | 10. | HD Ext Toshiba 1 TB     | Rp. 895000   |  \n" ;
	cout << "\t |_____|_________________________|______________|  \n" ;
	
	struct barang fd1;
	fd1.id = 1;
	fd1.nb = "Flashdisk Toshiba 4 GB";
	fd1.hb = 50000;

	struct barang fd2;
	fd2.id = 2;
	fd2.nb = "Flashdisk Toshiba 8 GB";
	fd2.hb = 65000;

	struct barang fd3;
	fd3.id = 3;
	fd3.nb = "Flashdisk Toshiba 16 GB";
	fd3.hb = 90000;

	struct barang fd4;
	fd4.id = 4;
	fd4.nb = "Flashdisk Toshiba 32 GB";
	fd4.hb = 110000;

	struct barang fd5;
	fd5.id = 5;
	fd5.nb = "Flashdisk Sandisk 4 GB";
	fd5.hb = 75000;

	struct barang hd1;
	hd1.id = 6;
	hd1.nb = "Hard Disk WD 500 GB";
	hd1.hb = 700000;

	struct barang hd2;
	hd2.id = 7;
	hd2.nb = "Hard Disk WD 1 TB";
	hd2.hb = 900000;

	struct barang hd3;
	hd3.id = 8;
	hd3.nb = "Hard Disk Dell 500 GB";
	hd3.hb = 670000;

	struct barang hd4;
	hd4.id = 9;
	hd4.nb = "Hard Disk Dell 1 TB";
	hd4.hb = 800000;

	struct barang hd5;
	hd5.id = 10;
	hd5.nb = "HD Ext Toshiba 1 TB";
	hd5.hb = 895000;


	int id, jumlahItem, total = 0, total2 = 0, bayar;
	string yn;
	
	do {
		cout << endl;
		cout << "Masukkan Kode Belanjaan Anda : "; cin >> id;
		
		if (id == 1) {
		cout << "Item anda : " << fd1.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * fd1.hb;
		fd1.count ++;
		
		} else if (id == 2){ 
		cout << "Item anda : " << fd2.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * fd2.hb;
		fd2.count ++;
		
		} else if (id == 3) {
		cout << "Item anda : " << fd3.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * fd3.hb;
		fd3.count ++;
		
		} else if (id == 4) {
		cout << "Item anda : " << fd4.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * fd4.hb;
		fd4.count ++;
		
		} else if (id == 5) {
		cout << "Item anda : " << fd5.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * fd5.hb;
		fd5.count ++;
		
		} else if (id == 6) {
		cout << "Item anda : " << hd1.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * hd1.hb;
		hd1.count ++;
		
		} else if (id == 7) {
		cout << "Item anda : " << hd2.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * hd2.hb;
		hd2.count ++;
		
		} else if (id == 8) {
		cout << "Item anda : " << hd3.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * hd3.hb;
		hd3.count ++;
		
		} else if (id == 9) {
		cout << "Item anda : " << hd4.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * hd4.hb;
		hd4.count ++;
	
		} else if (id == 10) {
		cout << "Item anda : " << hd5.nb << endl;
		cout << "Jumlah Pembelian Item : "; cin >> jumlahItem;
		total = jumlahItem * hd5.hb;
		hd5.count ++;
		}
		
		total2 = total2 + total;
		cout << "Beli lagi? (y/n) : "; cin >> yn;
	
	} while (yn == "y");
	
	cout << endl << endl;
	cout << "Struck Belanja" << endl;
	cout << "--------------" << endl;
	cout << "Daftar barang : ";
	
	for (int i=1; i<=fd1.count; i++){
	    cout << fd1.nb << " , ";
	}
	for (int i=1; i<=fd2.count; i++){
	    cout << fd2.nb << " , ";
	}
	for (int i=1; i<=fd3.count; i++){
	    cout << fd3.nb << " , ";
	}
	for (int i=1; i<=fd4.count; i++){
	    cout << fd4.nb << " , ";
	}
	for (int i=1; i<=fd5.count; i++){
	    cout << fd5.nb << " , ";
	}
	for (int i=1; i<=hd1.count; i++){
	    cout << hd1.nb << " , ";
	}
	for (int i=1; i<=hd2.count; i++){
	    cout << hd2.nb << " , ";
	}
	for (int i=1; i<=hd3.count; i++){
	    cout << hd3.nb << " , ";
	}
	for (int i=1; i<=hd4.count; i++){
	    cout << hd4.nb << " , ";
	}
	for (int i=1; i<=hd5.count; i++){
	    cout << hd5.nb << " , ";
	}
	
	cout << endl << "Total Yang Harus Dibayar : Rp. "<< total2 << ",-" << endl;
	
	do {
		cout << "Uang Anda : Rp. "; cin >> bayar; 
		if (bayar < total2) {
		    cout << "Maaf Uang Anda Kurang!" << endl;
		}
	} while (bayar < total2);
	
	cout << "Kembalian : Rp. " << bayar-total2 << ",-" <<endl;
	cout << "Enter untuk kembali";
	
	getchar ();
	if (cin.get() == '\n') {
		system ("CLS");
	}
	
	return 0;
 }
