/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robots;

/**
 *
 * @author galindo
 */
public class Cortador extends MiniRobot {

    public Cortador() {
        
    }
    
    @Override
    public boolean Accion(int disponible) {
        if( disponible <= 0 ) {
            return false;
        }
        
        System.out.println("Cortado!!");
        return true;
    }
}
