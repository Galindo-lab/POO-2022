/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robots;

/**
 *
 * @author galindo
 */
public class Calentador extends MiniRobot {
    
    static int UNDEFINED = 0;
    static int DESAYUNO = 1;
    static int COMIDA = 2;
    static int CENA = 3;

    private final int type;
    
    public Calentador(int type) {
        this.type = type;
    }

    @Override
    public boolean Accion(int disponible) {
        if( disponible <= 0 ) {
            return false;
        }
        
        System.out.println("Cocinado!!");
        return true;
    }

}
