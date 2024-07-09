/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2_672021030;
import java.util.Scanner;  
/**
 *
 * @author Lenovo
 */
public class Tugas2_672021030 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Menu
        Scanner sc=new Scanner(System.in); 
        String name;       
        char choice = 0;
        int p;
        System.out.print("Nama : ");
        name = sc.nextLine();
        do{
        System.out.println("Quiz Asistensi");
        System.out.println("1. Cetak NIM");
        System.out.println("2. Rekapitulasi Tugas");
        System.out.println("3. Exit");        
        System.out.print("Masukkan Pilihan : ");
        p=sc.nextInt();     
        switch(p){    
        case 1 -> {
            // Cetak NIM
            int n; 
            do{
            System.out.print("Masukkan Jumlah NIM : "); 
            n=sc.nextInt();
            int[] nim = new int[100];
            System.out.println("Masukkan NIM : ");
            for(int i=0; i<n; i++)
            {
                nim[i]=sc.nextInt();
            }   
            System.out.println("NIM : ");
            for(int i=0; i<n; i++)
            {
                System.out.println(nim[i]);
            }
            System.out.print("Lagi(y/n) :");                   
            choice = sc.next().charAt(0);
            }while (choice == 'y');
            }
        case 2 -> {  
            // Rekapitulasi Tugas
            int o;
            do{
            System.out.print("Jumlah Tugas : "); 
            o=sc.nextInt();
            int[] nilai = new int[10];
            for(int i=1; i<=o; i++)
            {  
                System.out.print("Tugas ke-" + i + ": ");
                nilai[i]=sc.nextInt();                
            }
            float hasil;
            int jumlah = 0;
            char predikat = 0;
            for( int num : nilai) {
                jumlah = jumlah+num;
            }
            hasil = jumlah/o;
            if (hasil >= 90) {
                predikat = 'A';
            }else if ( 90 > hasil && hasil > 64 ){
                predikat = 'B';
            }else if ( 65 > hasil && hasil > 49 ){
                predikat = 'C';
            }else if (hasil < 50){
                predikat = 'D';
            }
            System.out.println("Nilai Rata- rata " + name );
            System.out.println( hasil + " dengan predikat " + predikat);
            System.out.print("Lagi(y/n) :");                   
            choice = sc.next().charAt(0);
            }while(choice == 'y');
            }
        case 3 -> {
            // Exit
            System.exit(0);
            }        
        }
    }while(choice == 'n');
}    
}
