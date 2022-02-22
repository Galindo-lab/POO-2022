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

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public String getArrendador() {
        return Arrendador;
    }

    public void setArrendador(String Arrendador) {
        this.Arrendador = Arrendador;
    }

    public String getArrendatario() {
        return Arrendatario;
    }

    public void setArrendatario(String Arrendatario) {
        this.Arrendatario = Arrendatario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public float getPago() {
        return Pago;
    }

    public void setPago(float Pago) {
        this.Pago = Pago;
    }
    
    
}
