/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Lenovo
 */
public class Persegi extends Bangun2D{
    Persegi (int p, int l){
        this.p = p;
        this.l = l;
    }
    
    public String getNama(){
        return "Persegi";
    }
    
    @Override
    public float getLuas() {
        return this.p * this.l;
    }
    
}
