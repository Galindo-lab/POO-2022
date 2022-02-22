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
public class Computadora {
    private String modelo;
    private String procesador;
    private String marca;
    private int id;
    private float ram;

    @Override
    public String toString() {
        return "Computadora{" + "modelo=" + modelo + ", procesador=" + procesador + ", marca=" + marca + ", id=" + id + ", ram=" + ram + '}';
    }

    public Computadora(String modelo, String procesador, String marca, int id, float ram) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.marca = marca;
        this.id = id;
        this.ram = ram;
    }
    
    public Computadora(){
        this("","","",0,0f);
    }
    
    public Computadora(Scanner sc) {
        System.out.println("modelo: ");
        this.modelo = sc.next();
        System.out.println("procesador: ");
        this.procesador = sc.next();
        System.out.println("marca: ");
        this.marca = sc.next();
        System.out.println("id: ");
        this.id = sc.nextInt();
        System.out.println("ram: ");
        this.ram = sc.nextFloat();
    }
    
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    
    
    
}
