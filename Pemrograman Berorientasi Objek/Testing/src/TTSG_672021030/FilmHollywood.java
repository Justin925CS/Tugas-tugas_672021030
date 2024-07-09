/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSG_672021030;

/**
 *
 * @author Lenovo
 */
public class FilmHollywood extends CinemaXXI{
    int pajak;
    int harga;
    int hargatiket;
    int total;
    void HitungTotal() {
        if (hari == "Senin" || hari == "Selasa" || hari == "Rabu" || hari == "Kamis"){
            harga = 35000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Jumat"){
            harga = 40000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Sabtu"){
            harga = 50000;
            System.out.println("Harga tiket     : Rp "+harga);
        } else if (hari == "Minggu"){
            harga = 60000;
            System.out.println("Harga tiket     : Rp "+harga);
        }
    }
    void TotalBayar(){
        hargatiket= harga*tiket;
        pajak = hargatiket*5/100;
        total = hargatiket+pajak;
        System.out.println("Total Bayar     : Rp "+total);
    }
    void CekBonus(){
        if (total <= 200000){
            System.out.println("Selamat anda mendapatkan bonus 2 Botol Teh Pucuk Harum 400 ml");
        } else if (total <= 300000){
            System.out.println("Selamat anda mendapatkan bonus 4 Botol Teh Pucuk Harum 400 ml");
        } else if (total >300000){
            System.out.println("Selamat anda mendapatkan bonus Popcorn Caramel Ukuran L");
        } else if (total < 150000){
            System.out.println("Anda tidak mendapatkan bonus");
        }
    }
}
