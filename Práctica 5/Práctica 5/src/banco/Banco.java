package banco;

import java.util.Vector;
import java.util.stream.IntStream;

/**
 *
 * @author galindo
 */
public class Banco {

    // Constantes
    public final static int INVALID_IDENTIFIER = -1;
    public final static int SESSION_ACTIVE = 1;
    public final static int SESSION_INACTIVE = 0;

    // lista de cuentas 
    private Vector<Cuenta> cuentas = new Vector<>();

    // identificador de seccion 
    private int idSesion;

    public void mostrarCuentas() {
        cuentas.forEach(a -> System.out.println(a.toString()));
    }

    public void registrarCuenta(Cuenta foo) {
        cuentas.add(foo);
    }

    public int VerificarCuenta(String foo) {
        // https://stackoverflow.com/a/60006562
        return IntStream.range(0, this.cuentas.size())
                .filter(i -> this.cuentas.get(i).getNumeroCuenta().equals(foo))
                .findFirst()
                .orElse(Banco.INVALID_IDENTIFIER);
    }

    public Cuenta datosCuenta() {
        return this.cuentas.get(this.getIdSesion());
    }

    public boolean iniciarSesion(String foo, String nip) {
        this.setIdSesion(this.VerificarCuenta(foo));
        if (this.getIdSesion() == Banco.INVALID_IDENTIFIER) return false;
        if (this.datosCuenta().getNip().equals(nip)) {
            System.out.println("Bienvenido " + this.datosCuenta().getUsuario());
            System.out.println("Estado de cuenta: " + this.datosCuenta().getSaldo());
        }

        return true;
    }

    public boolean cerrarSesion() {
        this.setIdSesion(Banco.INVALID_IDENTIFIER);
        System.out.println("Exito!!");
        return true;
    }

    public boolean depositar(float saldo) {
        if (this.getSessionStatus() != Banco.SESSION_ACTIVE) return false;
        System.out.println("Exito!!");
        return this.cuentas.get(this.idSesion).depositar(saldo);
    }

    public boolean retirar(float saldo) {
        if (this.getSessionStatus() != Banco.SESSION_ACTIVE) return false;
        System.out.println("Exito!!");
        return this.cuentas.get(this.idSesion).retirar(saldo);
    }

    public int getSessionStatus() {
        if (this.getIdSesion() == Banco.INVALID_IDENTIFIER) return Banco.SESSION_INACTIVE;
        return Banco.SESSION_ACTIVE;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

}
