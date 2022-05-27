/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica11.Alumno;

import java.io.Serializable;

/**
 *
 * @author galindo
 */
public class Alumno implements Serializable {

    private String nombre;
    private String matrícula;
    private Calificaciones calificaciones;
    private Float promedio_general;

    public Alumno(String nombre, String matrícula, int[] calificaciones) {

        Calificaciones foo = new Calificaciones();
        foo.set(calificaciones);

        this.nombre = nombre;
        this.matrícula = matrícula;
        this.calificaciones = foo;
        this.promedio_general = foo.promedio();
    }
    
    @Override
    public String toString() {
        return "Alumno{"
                + "nombre=" + nombre
                + ", matr\u00edcula=" + matrícula
                + ", calificaciones=" + calificaciones
                + ", promedio_general=" + promedio_general
                + '}';
    }

}
