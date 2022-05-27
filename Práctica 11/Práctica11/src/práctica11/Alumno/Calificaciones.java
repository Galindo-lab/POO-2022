/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práctica11.Alumno;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author galindo
 */
public class Calificaciones implements Serializable  {

    private final int[] arr = new int[7];
    public static final int length = 7;

    public Calificaciones() {
        this.zeros();
    }

    void set(int i, int value) {
        this.arr[i] = value;
    }
    
    void set(int[] arr) {
        for (int i = 0; i < Calificaciones.length; i++) {
            this.set(i, arr[i]);
        }
    }

    public int get(int i) {
        return arr[i];
    }

    public void zeros() {
        for (int i = 0; i < Calificaciones.length; i++) {
            this.set(i, 0);
        }
    }
    
    public int sum() {
        int foo = 0;
        for (int i = 0; i < Calificaciones.length; i++) {
            foo += this.get(i);
        }
        return foo;
    }

    public float promedio() {
        return (float) this.sum() / Calificaciones.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr) ;
    }

}
