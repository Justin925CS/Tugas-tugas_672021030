/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;
import java.util.Vector;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class V2 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        int jumGenap = 0;
        int jumGanjil = 0;
        int pangkatGenap = 0;
        int pangkatGanjil = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyak Angka = ");
        int jml = input.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Angka ke " + (i + 1));
            int angka = input.nextInt();
            vec.add(angka);

        }
        System.out.println(">> Hasil Operasi Vector = ");
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i) % 2 == 0) {
                pangkatGenap = vec.get(i) * 2;
                vec.setElementAt(pangkatGenap, i);
                jumGenap += vec.get(i);
            }else{
                pangkatGanjil = vec.get(i) * 2;
                vec.setElementAt(pangkatGanjil, i);
                jumGanjil += vec.get(i);
            }
            System.out.println(" "+vec.get(i));

        }
        System.out.println(">> Hasil Penjumlahan Elemen Vector Genap = " +jumGenap);
        System.out.println(">> Hasil Penjumlahan Elemen Vector Ganjil = " +jumGanjil);
}
}
    
