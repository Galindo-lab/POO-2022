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

    /* Ejercicio 1: Implementa una clase con un constructor privado y ve que sucede. */
    /*
        El contructor solo puede accederse desde adentro de la clase
    */
    /* Ejercicio 2: Haz un constructor con parámetros. */
    
    /* Ejercicio 3: Haz un constructor con parámetros que usen los mismos 
                    nombres que los atributos de la clase, un método que imprima
                    los valores de las clases y vea si los valores se asignaron
                    correctamente. */
    
    /*Ejercicio 4: Modifique el constructor que realizó en el último ejercicio
                   agregando la palabra clave * "this" y verifique si los 
                   resultados son diferentes. */
    
    private Automovil(String marca, int year, String modelo, String color, String Fabricante) {
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

}
