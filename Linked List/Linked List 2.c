#include <stdio.h>
#include <stdlib.h>

struct node{
	int data;
	struct node* next;
};
struct node *head;

void awal(){
    //untuk isi node awal
    struct node *ptr;
    int item;
    ptr = (struct node *) malloc(sizeof(struct node *));
    if(ptr == NULL)
    {
        printf("\n OVERFLOW");
    }
    else
    {
        printf("Masukkan data : ");
        scanf("%d", &item);
        ptr-> data = item;
        ptr-> next = head;
        head = ptr;
        printf("\n Data berhasil tersimpan di NODE awal!\n");
    }
}

akhir(){
    //untuk isi node akhir
    struct node *ptr, *temp;
    int item;
    ptr = (struct node *) malloc(sizeof(struct node *));
    if(ptr == NULL)
    {
        printf("\n OVERFLOW");
    }
    else
    {
        printf("Masukkan data : ");
        scanf("%d", &item);
        ptr-> data = item;
        if(head == NULL)
        {
            ptr->next = NULL;
            head = ptr;
            printf("\n Berhasil menyimpan dalam NODE!\n");
        }
        else
        {
            temp = head;
            while(temp -> next != NULL)
            {
                temp = temp->next;
            }
            temp->next = ptr;
            ptr->next = NULL;
            printf("\n Data berhasil tersimpan di NODE akhir!\n");
        }
    }
}

sembarang(){
    //untuk isi node sisipan
    int i, loc, item;
    struct node *ptr, *temp;
    ptr = (struct node *) malloc(sizeof(struct node *));
    if(ptr == NULL)
    {
        printf("\n OVERFLOW");
    }
    else
    {
        printf("Masukkan data : ");
        scanf("%d", &item);
        ptr-> data = item;
        printf("Mau simpan di lokasi mana? : ");
        scanf("%d", &loc);
        temp = head;
        for(i=0;i<loc;i++)
        {
            temp = temp->next;
            if(temp == NULL)
            {
                printf("\n Tidak dapat tersimpan!");
                return;
            }
        }
        ptr->next = temp->next;
        temp->next = ptr;
        printf("\n NODE berhasil disimpan!");
    }
}

void lihat(){
    //untuk melihat isi dari linked List
    struct node *ptr;
    ptr = head;
    if(ptr == NULL)
    {
        printf("Tidak ada data!!!");
    }
    else
    {
        printf("Cetak data...");
        while(ptr!=NULL)
        {
            printf("\n%d", ptr->data);
            ptr = ptr->next;
        }
    }
}

int main(){
   int choice = 0;
   int pilihan;
   while(choice != 5) //5 untuk exit
   {
       printf("***********Menu Linked List***********\n");
       printf("======================================\n");
       printf("1. Input data di NODE awal \n2. Input data di NODE akhir \n3. Input data dalam NODE sembarang \n4.Lihat data dalam Linked List \n5. Keluar");
       printf("\nPilihan = ");
       scanf("%d", &pilihan);
       
       switch(pilihan)
       {
           case 1:
           awal();
           break;
           
           case 2:
           akhir();
           break;
           
           case 3:
           sembarang();
           break;
           
           case 4:
           lihat();
           break;
           
           case 5:
           //exit();
           break;
           
           default:
           printf("Silahkan masukan pilihanmu");
       }
   }
}
