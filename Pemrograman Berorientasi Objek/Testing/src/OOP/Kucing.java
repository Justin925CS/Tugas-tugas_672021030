/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Lenovo
 */
public class Kucing {
    private String nama;
    private String warna;
    private int umur;
    private int berat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
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
        System.out.println("Umur = " + umur + "tahun");
        System.out.println("Berat = " + berat + "Kg");
    }
}
