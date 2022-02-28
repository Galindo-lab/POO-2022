/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg3;

import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Estudiante {
    private String nombre;
    private String id;
    private String materia;
    private String estado;
    private float calificación;
    
    /* Constructores */

    public Estudiante(String id, String nombre, String materia, float calificación) {
        this.nombre = nombre;
        this.id = id;
        this.materia = materia;
        this.calificación = calificación;
        this.estado = this.Estado(calificación);
    }
    
    public Estudiante() {
        this.nombre = null;
        this.id = null;
        this.materia = null;
        this.calificación = 0f;
        this.estado = null;
    }
    
    /* metodos */
    
    public void asignarNombre(Scanner sc) {
        System.out.println("Estudiante {");
        System.out.print("ID=");
        this.id = sc.next();
        System.out.print("Nombre=");
        this.nombre = sc.next();
        System.out.print("Materia=");
        this.materia = sc.next();
        System.out.print("Calificación=");
        this.calificación = sc.nextFloat();
        this.asignarEstado();
    }
    
    private String Estado(float calificación) {
        return (calificación >= 60 ? "Aprobado" : "reprobado");
    }
    
    private String Estado() {
        return Estado(this.calificación);
    }
    
    public void asignarEstado() {
        this.estado = this.Estado();
    }

    @Override
    public String toString() {
        return "Estudiante{" 
                    + " id=" + id 
                    + ", nombre=" + nombre 
                    + ", materia=" + materia 
                    + ", estado=" + estado 
                    + ", calificaci\u00f3n=" + calificación 
                + " }";
    }

    /* Getters y Setters */
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCalificación() {
        return calificación;
    }

    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }
    
}
