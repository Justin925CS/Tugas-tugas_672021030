/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSG_672021030;

/**
 *
 * @author Lenovo
 */
public class CinemaXXI {
    String judul;
    String hari;
    int jam;
    int tiket;
    
    public String getJudul() {
        return judul;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getHari() {
        return hari;
    }
    
    public void setHari(String hari) {
        this.hari = hari;
    }
    
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    public int getTiket() {
        return tiket;
    }

    public void setTiket(int tiket) {
        this.tiket = tiket;
    }
    
    void cetaktiket(){
        System.out.println("---Pembelian Tiket Film---");
        System.out.println("Judul           : "+getJudul());
        System.out.println("Hari            : "+getHari());
        System.out.println("Jam             : "+getJam()+".00 WIB");
        System.out.println("Jumlah Tiket    : "+getTiket());
    }
}
