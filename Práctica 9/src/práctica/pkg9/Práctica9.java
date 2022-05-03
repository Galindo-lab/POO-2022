/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package práctica.pkg9;

import recetas.Ingrediente;
import recetas.Receta;
import robots.MagnumOpus;

/**
 *
 * @author galindo
 */
public class Práctica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char op;
        MagnumOpus mo = new MagnumOpus();
        
        Ingrediente carne = new Ingrediente("Carne",5);
        Ingrediente carne_cortada = new Ingrediente("Carne cortada",5);
        Ingrediente verdura = new Ingrediente("Verdura",5);
        Ingrediente verdura_picada = new Ingrediente("Verdura picada",5);
        
        Receta test = new Receta(Receta.COMIDA);
        test.addIngrediente(carne);
        test.addIngrediente(carne_cortada);
        test.addIngrediente(verdura);
        test.addIngrediente(verdura_picada );
        
        do {
            
            System.out.println(" Robot cocinero ");
            System.out.println("");
            System.out.println(" Test..........1");
            System.out.println("");
            System.out.println("------------------");
            System.out.println(" 0. salir");
            System.out.println("");
            
            op = CapturaEntrada.capturaChar("op");
            
            switch(op){
                case '1':
                    mo.cocinar(test);
                    break;
            }
            
        } while(op != '0');
    }
    
}
