#include<stdio.h>    
/*https://www.javatpoint.com/bubble-sort*/ 
 void bubble(int a[], int n) // fungsi untuk mengimplementasikan bubble sort  
 {  
   int i, j, temp;  
   for(i = 0; i < n; i++)    
    {    
      for(j = i+1; j < n; j++)    
        {    
            if(a[j] < a[i])    
            {    
                temp = a[i];    
                a[i] = a[j];    
                a[j] = temp;     
            }     
        }     
    }     
 }  
int main ()    
{    
    int arr[100], e, f;
	printf("Masukkan jumlah data : ");
	scanf("%d", &e);
	printf("Masukkan angka : \n");
	for(f = 0; f < e; f++){
    scanf("%d", &arr[f]);
  	}	         
    bubble(arr, e);  
    printf("Data setelah disusun menggunakan Bubble Sort dari kecil ke besar (Ascending): \n");    
    for(f = 0; f < e; f++){
    printf("%d ", arr[f]);
  } 
}    
