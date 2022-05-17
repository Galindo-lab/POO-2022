/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg10;

/**
 *
 * @author galindo
 */
public abstract class Animal {
    
    public void dormir() {
        System.out.println("ZZZZZZZZZZZZZZZ");
    }
    
    public void comer() {
        System.out.println("Ñom ñom");
    }

    @Override
    public String toString() {
        return "Animal";
    }

    
}
