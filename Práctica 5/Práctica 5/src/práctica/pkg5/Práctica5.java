/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg5;

import banco.Banco;
import banco.Cuenta;
import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Práctica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        Banco banco = new Banco();

        do {
            System.out.println("        *** Menu ***       ");
            System.out.println(" - 1: Crear cuenta.        ");
            System.out.println(" - 2: Acceder a una cuenta.");
            System.out.println(" - 3: Retirar.             ");
            System.out.println(" - 4: Depositar.           ");
            System.out.println(" - 5: Cerrar sesion. ");
            System.out.println(" --------------------------");
            System.out.println(" - 0: Salir \n");

            op = CapturaEntrada.capturaInt("Operacion");

            switch (op) {
                case 1:
                    banco.registrarCuenta(
                            CapturaEntrada.capturaCuenta()
                    );
                    break;

                case 2:
                    if(banco.iniciarSesion(
                            CapturaEntrada.capturaString("Numero de cuenta"),
                            CapturaEntrada.capturaString("Nip")
                    ))
                            
                    break;

                case 3:
                    banco.retirar(
                            CapturaEntrada.capturaFloat("Retiro")
                    );
                    break;

                case 4:
                    banco.depositar(
                            CapturaEntrada.capturaFloat("Deposito")
                    );
                    break;
                    
                case 5:
                    banco.cerrarSesion();
                    break;
            }

        } while (op != 0);

    }

}
