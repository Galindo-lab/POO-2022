/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg4;

import java.util.Date;

/**
 *
 * @author galindo
 */
public class Curp {

    // Funciones
    private static boolean vocal(char foo) {
        return "aeiouAEIOU".indexOf(foo) != -1;
    }

    private static char primeraVocal(String foo) {
        for (char c : foo.toCharArray()) {
            if (vocal(c)) {
                return c;
            }
        }

        return ' ';
    }

    private static char segundaConsonante(String foo) {
        String bar = foo.substring(1);
        for (char c : foo.toCharArray()) {
            if (!vocal(c)) {
                return c;
            }
        }

        return ' ';

    }

    public static String generar(Mexicano foo) {
        Nombre nombre = foo.getNombre();
        char genero = foo.getGenero();
        Date fecha = foo.getFechaNacimiento();
        String entidad = foo.getEntidadNacimiento();

        // primer apellido
        char primerLetraP = nombre.getPrimerApellido().charAt(0);
        char primerVocalP = primeraVocal(nombre.getPrimerApellido());

        //segundo apellido 
        char primerLetraS = nombre.getSegundoApellido().charAt(0);

        // nombre
        char primerLetraN = nombre.getPrimerNombre().charAt(0);

        // fecha
        int año = fecha.getYear();
        int mes = fecha.getMonth() + 1;
        int dia = fecha.getDate();

        // 
        char segundaConsonanteP = segundaConsonante(nombre.getPrimerApellido());
        char segundaConsonanteS = segundaConsonante(nombre.getSegundoApellido());
        char segundaConsonanteN = segundaConsonante(nombre.getPrimerNombre());

        StringBuilder sb = new StringBuilder();
        sb.append(primerLetraP);
        sb.append(primerVocalP);
        sb.append(primerLetraS);
        sb.append(primerLetraN);
        sb.append(String.format("%02d%02d%02d", año, mes, dia));
        sb.append(genero);
        sb.append(entidad);
        sb.append(segundaConsonanteP);
        sb.append(segundaConsonanteS);
        sb.append(segundaConsonanteN);
        sb.append("00");

        return sb.toString().toUpperCase();

    }
}
