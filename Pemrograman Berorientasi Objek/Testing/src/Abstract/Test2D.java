/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Lenovo
 */
public class Test2D {
    public void cetakInfo(Bangun2D tipe){
        System.out.println("Nama : " + tipe.getNama() + ", " + "Luas : " + tipe.getLuas());
    }
    public static void main(String[] args) {
        Test2D test= new Test2D();
        Persegi p = new Persegi(5, 4);
        Segitiga s = new Segitiga(5, 4);        
        test.cetakInfo(p);
        test.cetakInfo(s);
    }
}
