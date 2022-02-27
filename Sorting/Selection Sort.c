#include <stdio.h>
/*https://www.tutorialspoint.com/c-program-for-selection-sort*/
int main() {
   	int arr[100], e, f;
   	printf("Masukkan jumlah data : ");
	scanf("%d", &e);
	printf("Masukkan angka : \n");
	for(f = 0; f < e; f++){
    scanf("%d", &arr[f]);
  	}
   int i, j, position, swap;
   for (i = 0; i < (e - 1); i++) {
      position = i;
      for (j = i + 1; j < e; j++) {
         if (arr[position] > arr[j])
            position = j;
      }
      if (position != i) {
         swap = arr[i];
         arr[i] = arr[position];
         arr[position] = swap;
      }
   }
   printf("Data setelah disusun menggunakan Selection Sort dari kecil ke besar (Ascending): \n");
   for(f = 0; f < e; f++){
    printf("%d ", arr[f]);  
	}
    return 0;  
}
