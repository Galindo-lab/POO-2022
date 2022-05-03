/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recetas;

/**
 *
 * @author galindo
 */
public class Ingrediente implements Cocinable {

    private int cantidad;
    private String nombre;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean usar() {
        if (!this.disponible()) {
            return false;
        }

        this.cantidad--;
        return true;
    }

    @Override
    public boolean disponible() {
        return this.cantidad > 0;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }

}
