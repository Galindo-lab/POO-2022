/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Mexicano {

    private Date fechaNacimiento;
    private Nombre nombre;
    private String entidadNacimiento;
    private char genero;
    private String estatus;

    // https://stackoverflow.com/a/28542328
    private static final DateFormat fecha = new SimpleDateFormat("dd.MM.yyyy");

    public Mexicano(String nombre,char genero, String fechaNacimiento, String entidad, String estatus) throws ParseException {
        this.nombre = new Nombre(nombre);
        this.genero = genero;
        this.entidadNacimiento = entidad;
        this.fechaNacimiento = Mexicano.fecha.parse(fechaNacimiento);
        this.estatus = estatus;
    }
    
    public Mexicano(Scanner sc) throws ParseException {
        System.out.print("nombre: ");
        this.nombre = new Nombre(sc.nextLine());
        System.out.print("genero (H/M): ");
        this.genero = sc.next().charAt(0);
        System.out.print("Entidad: ");
        this.entidadNacimiento = sc.nextLine();
        System.out.print("fecha de nacimiento (dd.MM.YYYY): ");
        this.fechaNacimiento = Mexicano.fecha.parse(sc.nextLine());
        System.out.print("Estatus migratorio: ");
        this.estatus = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Mexicano{" 
                + "fechaNacimiento=" + fechaNacimiento
                + ", nombre=" + nombre 
                + ", entidadNacimiento=" + entidadNacimiento 
                + ", genero=" + genero 
                + ", estatus=" + estatus 
                + '}';
    }

    
    

    /* Getters y Setters */
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEntidadNacimiento() {
        return entidadNacimiento;
    }

    public void setEntidadNacimiento(String entidadNacimiento) {
        this.entidadNacimiento = entidadNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }


}
