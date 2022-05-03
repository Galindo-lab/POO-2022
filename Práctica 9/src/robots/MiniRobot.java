/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robots;

/**
 *
 * @author galindo
 */
public class MiniRobot implements MinirobotIntrface {
    
    int bateria;
    String nombre;
    String id;

    @Override
    public boolean Accion(int disponible) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void batería_restante() {
        System.out.println(this.bateria);
    }

    @Override
    public void nombre() {
        System.out.println(this.nombre);
    }

    @Override
    public void identificación() {
        System.out.println(this.id);
    }
    
}
