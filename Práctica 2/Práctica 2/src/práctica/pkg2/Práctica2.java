/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2;

import java.util.Scanner;
import java.util.Vector;
import práctica.pkg2.clases.Automovil;
import práctica.pkg2.clases.Cancion;
import práctica.pkg2.clases.Computadora;
import práctica.pkg2.clases.Contrato;
import práctica.pkg2.clases.Perro;

/**
 *
 * @author galindo
 */
public class Práctica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;

        Vector<Automovil> listaAutomoviles = new Vector<Automovil>();
        Vector<Cancion> listaCanciones = new Vector<Cancion>();
        Vector<Perro> listaPerros = new Vector<Perro>();
        Vector<Contrato> listaContratos = new Vector<Contrato>();
        Vector<Computadora> listaComputadoras = new Vector<Computadora>();

        do {
            System.out.println("Automovil ------+ Cancion --------");
            System.out.println("  a) Capturar   |   c) Capturar");
            System.out.println("  b) Imprimir   |   d) Imprimir");
            System.out.println("Computadora ----+ Contrato -------");
            System.out.println("  e) Capturar   |   g) Capturar");
            System.out.println("  f) Imprimir   |   h) Imprimir");
            System.out.println("Perro ----------+");
            System.out.println("  i) Capturar   |");
            System.out.println("----------------");
            System.out.println("  0) Salir");

            op = sc.next().charAt(0);

            switch (op) {
                case 'a':
                    listaAutomoviles.add(new Automovil(sc));
                    break;

                case 'b':
                    listaAutomoviles.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case 'c':
                    listaCanciones.add(new Cancion(sc));
                    break;

                case 'd':
                    listaCanciones.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case 'e':
                    listaComputadoras.add(new Computadora(sc));
                    break;

                case 'f':
                    listaComputadoras.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case 'g':
                    listaContratos.add(new Contrato(sc));
                    break;

                case 'h':
                    listaContratos.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case 'i':
                    listaPerros.add(new Perro(sc));
                    break;

                case 'j':
                    listaPerros.forEach((a) -> {
                        System.out.println(a.toString());
                    });
                    break;

                case '0':
                    System.out.println("Adios :)");
                    break;
            }

        } while (op != '0');

    }

}
