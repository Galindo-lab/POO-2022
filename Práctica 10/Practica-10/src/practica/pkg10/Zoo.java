/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg10;

import java.util.Vector;

/**
 *
 * @author galindo
 */
public class Zoo {
    private Vector<Animal> animales = new Vector<>();
    Veterinario vet;
    
    public Zoo(Veterinario foo) {
        this.vet = foo;
    }
    
    public void addAnimal(Animal foo) {
        animales.add(foo);
    }
    
    public void removeAnimal(Animal foo) {
        animales.remove(foo);
    }
    
    public void listAnimals() {
        for(Animal animal : animales) {
            System.out.println(animal.toString());
        }
    }
    
    public void atenderAnimales() {
        for(Animal animal : animales) {
            vet.curar(animal);
        }
    }
    
}
