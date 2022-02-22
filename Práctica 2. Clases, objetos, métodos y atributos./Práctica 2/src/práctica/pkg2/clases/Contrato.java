/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg2.clases;

import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Contrato {

    private String Arrendador;
    private String Arrendatario;
    private String Fecha;
    private float Pago;
    private float IVA;

    @Override
    public String toString() {
        return "Contrato{" + "Arrendador=" + Arrendador + ", Arrendatario=" + Arrendatario + ", Fecha=" + Fecha + ", Pago=" + Pago + ", IVA=" + IVA + '}';
    }

    public Contrato(String Arrendador, String Arrendatario, String Fecha, float Pago, float IVA) {
        this.Arrendador = Arrendador;
        this.Arrendatario = Arrendatario;
        this.Fecha = Fecha;
        this.Pago = Pago;
        this.IVA = IVA;
    }
    
    public Contrato() {
        this("","","",0f,0f);
    }
    
    public Contrato(Scanner sc) {
        System.out.println("Arrendador: ");
        this.Arrendador = sc.next();
        System.out.println("Arrendatario: ");
        this.Arrendatario = sc.next();
        System.out.println("Fecha: ");
        this.Fecha = sc.next();
        System.out.println("Pago: ");       
        this.Pago = sc.nextFloat();
        System.out.println("IVA: ");
        this.IVA = sc.nextFloat();
    }

    
}
