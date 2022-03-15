package banco;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author galindo
 */
public class Cuenta {

    // identificador de instancia
    private static int id = 0;

    // ingresados por el usuario
    private final String usuario;
    private String direccion;
    private String nip;

    // autogenerado
    private Date fechaVencimiento;
    private final String numeroCuenta;

    // inicializado
    private float saldo;

    public Cuenta(String usuario, String direccion, String nip) {
        this.usuario = usuario;
        this.direccion = direccion;
        this.nip = nip;

        this.fechaVencimiento = calcFechaVenciamiento();
        // el numero de instancia es el numero de cuenta, este es constante
        
        this.numeroCuenta = Integer.toString(id++);
        this.saldo = 0f;
    }

    private static Date calcFechaVenciamiento() {
        // https://stackoverflow.com/a/16392922
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 4);
        return cal.getTime();
    }

    public boolean depositar(float saldo) {
        this.saldo += saldo;
        return true;
    }

    public boolean retirar(float saldo) {
        if (this.saldo - saldo < 0) return false;
        this.saldo -= saldo;
        return true;
    }

    @Override
    public String toString() {
        return "Cuenta{" 
                + "usuario=" + usuario 
                + ", direccion=" + direccion 
                + ", nip=" + nip 
                + ", fechaVencimiento=" + fechaVencimiento 
                + ", numeroCuenta=" + numeroCuenta 
                + ", saldo=" + saldo 
            + '}';
    }

    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void updateFechaVencimiento() {
        this.fechaVencimiento = calcFechaVenciamiento();
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public float getSaldo() {
        return saldo;
    }
    
    

}
