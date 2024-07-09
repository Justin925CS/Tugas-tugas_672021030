/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quiz Asistensi");
        System.out.println("1. Kalkulator");
        System.out.println("2. Data Diri");
        System.out.println("3. Exit");
        System.out.println("Pilih :");
        Scanner pilihan = new Scanner(System.in);
        int n = pilihan.nextInt();
        switch (n) {
  case 1:
    Scanner operator = new Scanner(System.in);          
    System.out.println("Masukkan bilangan pertama   :");
    float i, j;
    i = operator.nextFloat();
    System.out.println("Masukkan bilangan kedua     :");
    j = operator.nextFloat();
    Scanner operasi = new Scanner(System.in);
    System.out.println("1. +");
    System.out.println("2. -");
    System.out.println("3. x");
    System.out.println("4. :");
    System.out.println("Pilih operasi :");
    int k = operasi.nextInt();
    float Hasil;
        switch (k)  {
            case 1:
            Hasil = i+j;
            System.out.println(+Hasil);
            break;
            case 2:
            Hasil = i-j;
            System.out.println(+Hasil);    
            break;
            case 3:
            Hasil = i*j;
            System.out.println(+Hasil);    
            break;
            case 4:
            Hasil = i/j;
            System.out.println(+Hasil);   
            break;
        }
    break;
  case 2:
    System.out.println("Nama    : Justin Clarence Setiawan");
    System.out.println("NIM     : 672021030");
    break;
  case 3:
    System.out.println("Terima kasih");
    break;
}
        // TODO code application logic here
    }
    
}
