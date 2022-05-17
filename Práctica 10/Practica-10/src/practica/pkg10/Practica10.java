/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg10;

/**
 *
 * @author galindo
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veterinario vet = new Veterinario("Carlos");
        
        Zoo zoologico = new Zoo(vet);
        
        Gato gato = new Gato();
        Perro perro = new Perro();
        
        zoologico.addAnimal(gato);
        zoologico.addAnimal(perro);
        
        zoologico.listAnimals();   
    }
}
