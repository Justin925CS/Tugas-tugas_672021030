/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;  
/**
 *
 * @author Lenovo
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner ar = new Scanner(System.in); 
        System.out.print("Masukkan Jumlah Elemen : ");
        n = ar.nextInt();
        int[] array = new int[10];
        int jumlah =0;        
        for(int i=0; i<n; i++)  
        {     
        System.out.print("Masukkan Elemen Array ke-" +i+ " : ");
        array[i]= ar.nextInt(); 
        jumlah += array[i];
        }  
        System.out.println("Hail Penjumlahan = " +jumlah);  
        // accessing array elements using the for loop 
    }
    
}
