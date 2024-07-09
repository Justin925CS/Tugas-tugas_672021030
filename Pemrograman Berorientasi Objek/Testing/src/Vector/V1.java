/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;
import java.util.Vector;
/**
 *
 * @author Lenovo
 */
public class V1 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(22);
        vec.add(10);
        vec.add(15);
        vec.add(3);
        vec.add(8);
        vec.add(2);
        
        System.out.println("Jumlah Elemen Vector : "+vec.size());
        System.out.println("Cetak Isi Vector = ");
        for(int i = 0;i < vec.size(); i++){
        System.out.println(""+vec.get(i));
    }
        System.out.println("");
        for(Integer data : vec){
            System.out.println(data + " ");
        }
        
    }
}
