/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg4;

/**
 *
 * @author galindo
 */
public class Nombre {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    //       BUG: Fragil 
    // IMPORTANT: se tienen que capturar los datos con nextLine.
    public Nombre(String nombre) {
        // https://stackoverflow.com/a/30220543
        // Trim elimina espacios repetidos.
        String[] p = nombre.trim().split("\\s+");
        this.primerNombre = p[0];
        this.segundoNombre = p[1];
        this.primerApellido = p[2];
        this.segundoApellido = p[3];
    }

    // String 
    @Override
    public String toString() {
        return "Nombre{"
                + "primerNombre=" + primerNombre
                + ", segundoNombre=" + segundoNombre
                + ", primerApellido=" + primerApellido
                + ", segundoApellido=" + segundoApellido
                + '}';
    }

    // Getters y Setters
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

}
