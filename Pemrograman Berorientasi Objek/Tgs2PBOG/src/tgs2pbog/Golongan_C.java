/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2pbog;

/**
 *
 * @author Lenovo
 */
public class Golongan_C extends Pegawai{
    private int gajipokok = 1000000;
    int bonus;
    void cekBonus() {
        int bonus;
        if (jam_lembur >= 10){
        bonus = 100000;
        }else if (jam_lembur <= 9 && jam_lembur >= 1){
        bonus = 50000;
        }else{
        bonus = 0;
        }
    System.out.println("Bonus      = "+bonus);
        }
    void TotalGaji(){
    int gajiTotal;
        gajiTotal = gajipokok + bonus;
    System.out.println("Gaji Total  = "+gajiTotal);
        }
}
