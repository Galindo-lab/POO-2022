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
        Scanner sc = new Scanner(System.in);
        char op = ' ';

        registroEstudiantes.add(new Estudiante("0", "Luis", "Historia", 60));
        registroEstudiantes.add(new Estudiante("1", "Mario", "Matematicas", 95));
        registroEstudiantes.add(new Estudiante("2", "Pedro", "Ciaencias", 76));
        registroEstudiantes.add(new Estudiante("3", "Fransisco", "Calculo", 89));
        registroEstudiantes.add(new Estudiante("4", "Aldo", "Quimica", 45));

        do {

            System.out.println("Menú --------------\n");
            System.out.println(" a. Capturar alumnos");
            System.out.println(" b. Mostrar alumnos");
            System.out.println(" c. Salir");

            op = sc.next().charAt(0);
            
            switch(op) {
                case 'a':
                    break;
                    
                case 'b':
                    break;
                    
                case 'c':
                    break;
                    
                default:
                    break;
            }

        } while (op != 'c');
    }

}
