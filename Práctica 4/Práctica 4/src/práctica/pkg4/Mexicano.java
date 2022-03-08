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
    private Nombre nombre;

    // https://stackoverflow.com/a/28542328
    private static final DateFormat fecha = new SimpleDateFormat("dd.MM.yyyy");

    public Mexicano(String nombre, String fechaNacimiento) throws ParseException {
        this.nombre = new Nombre(nombre);
        this.fechaNacimiento = Mexicano.fecha.parse(fechaNacimiento);
    }

    /* Getters y Setters */
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
