/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;

/**
 *
 * @author Lenovo
 */
public class Kucing {
    String nama;
    String warna;
    int umur;
    int berat;
    
    public Kucing(String nama, String warna,int umur, int berat){
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
        this.berat = berat;
    }
    void Meong(){
        System.out.println("Method Meong() dijalankan");
    }
    void Makan(){
        System.out.println("Method Makan() dijalankan");
    }
    void CetakInfo() {
        System.out.println("Nama = " + nama);
        System.out.println("Warna = " + warna);
        System.out.println("Umur = " + umur + " tahun");
        System.out.println("Berat = " + berat + " kg");
    }
}
