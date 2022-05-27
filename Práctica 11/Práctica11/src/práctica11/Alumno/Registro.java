/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica11.Alumno;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author galindo
 */
public class Registro {

    private Vector<Alumno> registros = new Vector<>();
    private static final String FILE = "output.es";

    public Registro() {

    }

    public void showRegistos() {
        for (Alumno foo : this.registros) {
            System.out.println(foo.toString());
        }
    }

    public void add(Alumno e) {
        this.registros.add(e);
    }
    
    // https://stackoverflow.com/a/17297082

    public void save() {
        try {
            FileOutputStream fout = new FileOutputStream(FILE, true);
            try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
                for (Alumno foo : this.registros) {
                    oos.writeObject(foo);
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public void load() {
        try {
            FileInputStream streamIn = new FileInputStream(FILE);
            try (ObjectInputStream objectinputstream = new ObjectInputStream(streamIn)) {
                while (true) {
                    var foo = objectinputstream.readObject();
                    Alumno readCase = (Alumno) foo;
                    
                    if (readCase == null) {break;}
                    
                    registros.add(readCase);
                    
                }
            }

        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.toString());
        }
    }

}
