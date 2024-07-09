/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSG_672021030;

/**
 *
 * @author Lenovo
 */
public class FilmIndonesia extends CinemaXXI{
    int pajak;
    int hargatiket;
    int harga;
    int total;
    void HitungTotal() {
        if (hari == "Senin" || hari == "Selasa" || hari == "Rabu" || hari == "Kamis"){
            harga = 25000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Jumat"){
            harga = 30000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Sabtu"){
            harga = 40000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Minggu"){
            harga = 50000;
            System.out.println("Harga tiket     : Rp "+harga);
        }
    }
    void TotalBayar(){
        hargatiket= harga*tiket;
        pajak = hargatiket*5/2/100;
        total = hargatiket+pajak;
        System.out.println("Total Bayar     : Rp "+total);
    }
    void CekBonus(){
        if (total <= 150000){
            System.out.println("Selamat anda mendapatkan bonus 1 Botol Aqua 400 ml");
        } else if (total <= 200000){
            System.out.println("Selamat anda mendapatkan bonus 2 Botol Aqua 400 ml");
        } else if (total >200000){
            System.out.println("Selamat anda mendapatkan bonus 2 Popcorn Asin Ukuran M");
        } else if (total < 100000){
            System.out.println("Anda tidak mendapatkan bonus");
        }
    }
}
