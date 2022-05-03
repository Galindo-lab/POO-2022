/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robots;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import recetas.Receta;

/**
 *
 * @author galindo
 */
public class MagnumOpus {

    private Map<String, Integer> inventario = new HashMap<>();
    private Vector<Cortador> Calentador = new Vector();
    private Cortador cortador = new Cortador();

    public MagnumOpus() {
        inventario.put("Carne", 10);
        inventario.put("Carne cortada", 10);
        inventario.put("Verdura", 10);
        inventario.put("Verdura picada", 10);
        inventario.put("Guiso", 10);
    }

    public void cocinar(Receta receta) {
        if (this.cocinable(receta)) {
            for (Map.Entry<String, Integer> entry : receta.receta.entrySet()) {
                inventario.put(entry.getKey(), inventario.get(entry.getKey()) - 1);
                System.out.println(entry.getKey() + " = " + inventario.get(entry.getKey()));
            }
            
            this.cortar_carne();
            this.picar_verduras();
            this.cocinar_guiso();
        }
    }

    boolean cocinable(Receta receta) {
        for (Map.Entry<String, Integer> entry : receta.receta.entrySet()) {
            if (this.inventario.get(entry.getKey()) <= 0) {
                return false;
            }
        }

        return true;
    }

    void cortar_carne() {
        System.out.println("Carne cortada!!!");
    }

    void picar_verduras() {
        System.out.println("Verduras picadas!!");
    }

    void cocinar_guiso() {
        System.out.println("cocinado!!!");
    }
}
