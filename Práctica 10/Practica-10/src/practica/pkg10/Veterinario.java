/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg10;

/**
 *
 * @author galindo
 */
public class Veterinario {
    String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }
    
    public void curar(Animal a) {
        System.out.println(a.toString() + " Curado");
    }
    
}
