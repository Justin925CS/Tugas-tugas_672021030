/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

/**
 *
 * @author Lenovo
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {            
            for (int j = 0; j < 4; j++) {
                System.out.print("*");                
            } 
            System.out.println("");
        }
        // TODO code application logic here
        for (int i = 1; i <= 4; i++) {            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");                
            } 
            System.out.println("");
        }
        for (int i = 1; i <= 4; i++) {            
            for (int j = 4; j >= i; j--) {
                System.out.print("*");                
            } 
            System.out.println("");
        }
    }
    
}
