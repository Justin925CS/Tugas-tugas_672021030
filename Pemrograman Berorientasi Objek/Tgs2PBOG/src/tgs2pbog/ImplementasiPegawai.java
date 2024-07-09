/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs2pbog;

/**
 *
 * @author Lenovo
 */
public class ImplementasiPegawai {
    public static void main(String[] args) {
        Golongan_A alpha = new Golongan_A();
        alpha.setNama("Joko");
        alpha.setNIP(50001);
        alpha.setjamlembur(11);
        System.out.println("== Golongan A ==");
        System.out.println("Nama       = "+alpha.getNama());
        System.out.println("NIP        = "+alpha.getNIP());
        System.out.println("Jam Lembur = "+alpha.getjamlembur()); 
        alpha.cekBonus();
        alpha.TotalGaji();
        
        Golongan_B betha = new Golongan_B();
        betha.setNama("Suryo");
        betha.setNIP(50002);
        betha.setjamlembur(8);
        System.out.println("== Golongan B ==");
        System.out.println("Nama       = "+betha.getNama());
        System.out.println("NIP        = "+betha.getNIP());
        System.out.println("Jam Lembur = "+betha.getjamlembur()); 
        betha.cekBonus();
        betha.TotalGaji();
        
        Golongan_C gamma = new Golongan_C();
        gamma.setNama("Putri");
        gamma.setNIP(50003);
        gamma.setjamlembur(0);
        System.out.println("== Golongan C ==");
        System.out.println("Nama       = "+gamma.getNama());
        System.out.println("NIP        = "+gamma.getNIP());
        System.out.println("Jam Lembur = "+gamma.getjamlembur()); 
        gamma.cekBonus();
        gamma.TotalGaji();
    }
}
