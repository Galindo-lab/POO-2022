/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package práctica.pkg4;

    /**
     *
     * @author galindo
     */
    public class RFC {

        public static String generar(Mexicano foo) {
            return Curp.generar(foo).substring(0, 10);
        }
    }
