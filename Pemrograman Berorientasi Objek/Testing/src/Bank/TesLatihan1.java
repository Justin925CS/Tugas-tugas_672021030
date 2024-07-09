/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Lenovo
 */
public class TesLatihan1 {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        tabungan.setsaldo(20000);
        tabungan.setambil(5000);
        System.out.println("Saldo awal : "+tabungan.saldo);
        tabungan.ambilUang();
        tabungan.jumlah();
    }
}
