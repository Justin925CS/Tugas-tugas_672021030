/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Lenovo
 */
public class Mhs_S1 extends ClassMahasiswa {
    public void CekCumlaude(){
        if(ipk>3.5){
            System.out.println("Keterangan : Cumlaude");
        }else{
            System.out.println("Keterangan : TidakCumlaude");
        }
    }
    public static void main(String[] args) {
        Mhs_S1 x = new Mhs_S1();
        x.nim = 672025001;
        x.nama ="Budi";
        x.ipk = 3.45;
        x.CetakMhs();
        x.CekCumlaude();
        System.out.println("");
    }
}
