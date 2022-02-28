/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author galindo
 */
public class Práctica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vector<Estudiante> registroEstudiantes = new Vector<>();
        Estudiante captura = new Estudiante();
        Scanner sc = new Scanner(System.in);
        char op = ' ';

        registroEstudiantes.add(new Estudiante("0", "Luis", "Historia", 60));
        registroEstudiantes.add(new Estudiante("1", "Mario", "Matematicas", 95));
        registroEstudiantes.add(new Estudiante("2", "Pedro", "Ciaencias", 76));
        registroEstudiantes.add(new Estudiante("3", "Fransisco", "Calculo", 89));
        registroEstudiantes.add(new Estudiante("4", "Aldo", "Quimica", 45));

        do {

            System.out.println("Menú --------------\n");
            System.out.println(" a. Capturar Alumnos");
            System.out.println(" b. Mostrar Alumnos");
            System.out.println(" c. Salir");

            op = sc.next().charAt(0);
            
            switch(op) {
                case 'a':
                    captura.asignarNombre(sc);
                    registroEstudiantes.add(captura);
                    break;
                    
                case 'b':
                    registroEstudiantes.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;
                    
                case 'c':
                    System.out.println("hasta la proxima :)");
                    break;
                    
                default:
                    break;
            }

        } while (op != 'c');
    }

}
