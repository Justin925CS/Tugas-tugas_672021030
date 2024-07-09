/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Human> list1 = new ArrayList<Human>();
        for(int i = 0; i < 10; i++){
            list1.add(new Human("Human " + i));
        }
        
        for(Human h : list1){
            System.out.println(h.name);
        }
    }
   
}
 class Human{
        public String name;
        public Human(String name){
            this.name = name;
        }
    }