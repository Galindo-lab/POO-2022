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
public class Automovil {

    private String marca;
    private int year;
    private String modelo;
    private String color;
    private String Fabricante;

    
    public Automovil(String marca, int year, String modelo, String color, String Fabricante) {
        this.marca = marca;
        this.year = year;
        this.modelo = modelo;
        this.color = color;
        this.Fabricante = Fabricante;
        
        System.out.println(this.toString());
    }       

    public Automovil() {
        this("",0,"","","");
    }       
    
    public Automovil(Scanner sc) {
        System.out.println("marca: ");
        this.marca = sc.next();
        System.out.println("Año: ");
        this.year = sc.nextInt();
        System.out.println("Modelo: ");
        this.modelo = sc.next();
        System.out.println("Color: ");
        this.color = sc.next();
        System.out.println("Fabricante: ");
        this.Fabricante = sc.next();
    }
    
    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", year=" + year + ", modelo=" + modelo + ", color=" + color + ", Fabricante=" + Fabricante + '}';
    }

}
