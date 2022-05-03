/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recetas;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author galindo
 */
public class Receta {

    public static int UNDEFINED = 0;
    public static int DESAYUNO = 1;
    public static int COMIDA = 2;
    public static int CENA = 3;

    
    public Map<String, Integer> receta = new HashMap<>();
    private int tipo_de_comida;

    public Receta(int tipo) {
        this.tipo_de_comida = tipo;
    }
    
    public void addIngrediente(Ingrediente ingrediente) {
        receta.put(ingrediente.getNombre(), ingrediente.getCantidad());
    }
    
    public void setReceta(Map<String, Integer> receta) {
        this.receta = receta;
    }

    public int getTipo_de_comida() {
        return tipo_de_comida;
    }

    public void setTipo_de_comida(int tipo_de_comida) {
        this.tipo_de_comida = tipo_de_comida;
    }
    
    

    
}