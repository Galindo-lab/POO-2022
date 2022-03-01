/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2.clases;

import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Cancion {

    private int id;
    private String nombre;
    private Float duracion;
    private String autor;
    private String lanzamiento;

    public Cancion(int id, String nombre, Float duracion, String autor, String lanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.lanzamiento = lanzamiento;
    }
    
    public Cancion() {
        this(0,"",0f,"","");
    }
    
    public Cancion(Scanner sc) {
        System.out.println("ID: ");
        this.id = sc.nextInt();
        System.out.println("Nombre: ");
        this.nombre = sc.next();
        System.out.println("duracion: ");
        this.duracion = sc.nextFloat();
        System.out.println("autor: ");
        this.autor = sc.next();
        System.out.println("fecha de lanzamiento: ");
        this.lanzamiento = sc.next();
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", autor=" + autor + ", lanzamiento=" + lanzamiento + '}';
    }

}
