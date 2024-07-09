/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Lenovo
 */
public class TestKucing {
    public static void main(String[] args) {
        Kucing garong = new Kucing();
    garong.setNama("Si Garong");
    garong.setWarna("Hitam");
    garong.setBerat(5);
    garong.setUmur(2);
    
    System.out.println("Nama  : "+garong.getNama());
    System.out.println("Warna : "+garong.getWarna());
    System.out.println("Berat : "+garong.getBerat());
    System.out.println("Umur  : "+garong.getUmur());
    }
    
}
