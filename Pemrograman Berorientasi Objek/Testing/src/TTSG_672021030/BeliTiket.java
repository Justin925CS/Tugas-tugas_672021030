/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSG_672021030;

/**
 *
 * @author Lenovo
 */
public class BeliTiket {
    public static void main(String[] args) {
        FilmHollywood barat = new FilmHollywood();
        barat.setJudul("Top Gun : Maverick");
        barat.setHari("Kamis");
        barat.setJam(15);
        barat.setTiket(5);
        barat.cetaktiket();        
        barat.HitungTotal();
        barat.TotalBayar();
        barat.CekBonus();
        
        FilmIndonesia indo = new FilmIndonesia();
        indo.setJudul("Pamali");
        indo.setHari("Sabtu");
        indo.setJam(20);
        indo.setTiket(10);
        indo.cetaktiket();        
        indo.HitungTotal();
        indo.TotalBayar();
        indo.CekBonus();
                
    }
    
}
