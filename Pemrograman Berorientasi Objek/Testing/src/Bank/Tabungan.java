/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Lenovo
 */
public class Tabungan {
    int saldo;
    int ambil;
    
    public int getsaldo() {
        return saldo;
    }
    
    public void setsaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int getambil() {
        return ambil;
    }
    
    public void setambil(int ambil) {
        this.ambil = ambil;
    }
    
    int jumlah;
    void ambilUang(){
        System.out.println("Jumlah uang yang diambil : "+ambil);
    }
    void jumlah(){
        int jumlah;
        jumlah = saldo - ambil;
        System.out.println("Saldo sekarang           : "+jumlah);
    }
}
