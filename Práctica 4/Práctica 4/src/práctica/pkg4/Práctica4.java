/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg4;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author galindo
 */
public class Práctica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char op;
        
        Mexicano m = new Mexicano(sc);
        
        do{
            System.out.println(" 1. Capurar");
            System.out.println(" 2. CURP ");
            System.out.println(" 3. RFC");
            System.out.println(" 4. Informacion");
            System.out.println("-----------------");
            System.out.println(" 0. salir");
            
            op = sc.next().charAt(0);
            
            switch(op) {
                case '1':
                    m = new Mexicano(sc);
                    break;
                    
                case '2':
                    System.out.println(Curp.generar(m));
                    break; 
                    
                case '3':
                    System.out.println(RFC.generar(m));
                    break;
                   
                case '4':
                    System.out.println(m.toString());
                    break;
            }
            
        }while(op != '0');
        
        //Mexicano v = new Mexicano("LUIS Fransisco ROMERO PLAZUELOS", 'H', "01.12.1995", "BS", "mexicano");
        //System.out.println(v.toString());
        //System.out.println(Curp.generar(v));
        //System.out.println(RFC.generar(v));
    }
    
}
