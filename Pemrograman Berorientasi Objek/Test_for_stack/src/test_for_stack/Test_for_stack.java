/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_for_stack;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Test_for_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Masukkan Tinggi Segitiga");

        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {            
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j + " ");                
            } 
            System.out.println("");
        }
    }
        // TODO code application logic here
    }
    
}
