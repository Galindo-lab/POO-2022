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

/**
 *
 * @author galindo
 */
public class Mexicano {

    private Date fechaNacimiento;
    Nombre nombre;
    
    private static final DateFormat fecha = new SimpleDateFormat("dd.MM.yyyy");

    
    
    public Mexicano(String fechaNacimiento) throws ParseException {
        
        
        this.fechaNacimiento = Mexicano.fecha.parse(fechaNacimiento);
    }

    
    /* Getters y Setters */
    
    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
