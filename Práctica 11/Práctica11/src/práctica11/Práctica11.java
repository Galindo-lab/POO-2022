/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica11;

import práctica11.Alumno.Alumno;
import java.io.FileNotFoundException;
import java.io.IOException;
import práctica11.Alumno.Registro;

/**
 *
 * @author galindo
 */
public class Práctica11 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        
        
        
        
        
        Registro registros = new Registro();
        Registro registros2 = new Registro();

        Alumno a = new Alumno("Juan0", "12312", intArray);
        Alumno b = new Alumno("Juan1", "12312", intArray);
        Alumno c = new Alumno("Juan2", "12312", intArray);

        registros.add(a);
        registros.add(b);
        registros.add(c);
        
        registros.save();
        
        registros2.load();
        registros2.showRegistos();
    }

}
