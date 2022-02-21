#include <stdio.h>  
void insert(int a[], int n) 
{  
    int i, j, k;  
    for (i = 1; i < n; i++) {
        k = a[i];  
        j = i - 1;  
  
        while(j>=0 && k <= a[j])    
        {    
            a[j+1] = a[j];     
            j = j-1;    
        }    
        a[j+1] = k;    
    }  
}  
  
void printArr(int a[], int n)   
{  
    int i;  
    for (i = 0; i < n; i++)  
        printf("%d ", a[i]);  
}  
  
int main()  
{  
    int a[] = { 23, 67, 89, 5, 45, 20, 15, 27 };  
    int n = sizeof(a) / sizeof(a[0]);       
    insert(a, n);  
    printf("Menyusun dari kecil ke besar (Ascending) menggunakan Insertion Sort: \n");    
    printArr(a, n);  
  
	int arr[8]={23, 67, 89, 5, 45, 20, 15, 27};
   int o=8;
   int i, j, position, swap;
   for (i = 0; i < (o - 1); i++) {
      position = i;
      for (j = i + 1; j < o; j++) {
         if (arr[position] > arr[j])
            position = j;
      }
      if (position != i) {
         swap = arr[i];
         arr[i] = arr[position];
         arr[position] = swap;
      }
   }
   printf("\nMenyusun dari kecil ke besar (Ascending) menggunakan Selection Sort: \n");
   for (i = 0; i < o; i++)
      printf("%d ", arr[i]);
   return 0;  
}    
 
