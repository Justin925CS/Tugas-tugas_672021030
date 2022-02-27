#include <stdio.h>  
#include <conio.h>
/*https://www.javatpoint.com/insertion-sort*/ 
void insert(int data[], int n) /* fungsi untuk menyusun array menggunakan insertion sort */  
{  
    int i, j, k;  
    for (i = 1; i < n; i++) {
        k = data[i];  
        j = i - 1;  
  
        while(j>=0 && k <= data[j])   /*Pindahkan elemen yang lebih besar dari k ke satu posisi di depan dari posisi mereka saat ini*/ 
        {    
            data[j+1] = data[j];     
            j = j-1;    
        }    
        data[j+1] = k;    
    }  
}    
int main()  
{  
    int arr[100], e, f;
	printf("Masukkan jumlah data : ");
	scanf("%d", &e);
	printf("Masukkan angka : \n");
	for(f = 0; f < e; f++){
    scanf("%d", &arr[f]);
  	}       
    insert(arr, e);  
    printf("Data setelah disusun menggunakan Insertion Sort dari kecil ke besar (Ascending): \n");    
    for(f = 0; f < e; f++){
    printf("%d ", arr[f]);  
	}
    return 0;  
}    
