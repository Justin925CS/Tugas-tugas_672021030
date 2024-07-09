/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pembagian;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Pembagian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka 1 = ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2 = ");
        int angka2 = input.nextInt();
        try {
            float hasil = angka1/angka2;
            System.out.println("Hasil Pembagian " + angka1 + "/" + angka2 + " = " + hasil);
        }catch (Exception e) {
            System.out.println("Tidak bisa dibagi 0 !!!");
        }
        System.out.println("Baris perintah berikutnya akan tetap dijalankan ...");
        // TODO code application logic here
    }
    
}
