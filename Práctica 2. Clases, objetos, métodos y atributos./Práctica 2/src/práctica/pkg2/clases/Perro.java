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
public class Perro {

    private String Nombre;
    private int Edad;
    private float Peso;
    private float Altura;
    private char Sexo;

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + ", Altura=" + Altura + ", Sexo=" + Sexo + '}';
    }

    public Perro(String Nombre, int Edad, float Peso, float Altura, char Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Sexo = Sexo;
    }
    
    public Perro() {
        this("",0,0f,0f,' ');
    }

    public Perro(Scanner sc) {
        System.out.println("Nombre: ");
        this.Nombre = sc.next();
        System.out.println("Edad: ");
        this.Edad = sc.nextInt();
        System.out.println("Peso");
        this.Peso = sc.nextFloat();
        System.out.println("altura: ");
        this.Altura = sc.nextFloat();
        System.out.println("Sexo (F/M): ");
        this.Sexo = sc.next().charAt(0);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
}
