/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2pbog;

/**
 *
 * @author Lenovo
 */
public class Golongan_A extends Pegawai{
    private int gajiPokok = 2000000;
    int bonus;        
    void cekBonus() {
        if (jam_lembur >= 10){
        bonus = 300000;
        }else if (jam_lembur <= 9){
        bonus = 150000;
        }else{
        bonus = 0;
        }
    System.out.println("Bonus = "+bonus);
    }
    void TotalGaji(){
        int gajiTotal;
        gajiTotal = gajiPokok + bonus;
        System.out.println("Gaji Total = "+gajiTotal);
    }
}
