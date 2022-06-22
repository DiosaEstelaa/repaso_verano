/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoverano;

import javax.swing.JOptionPane;

/**
 *
 * @author estel
 */
//v pilInf
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = JOptionPane.showInputDialog(" Introduce tu nombre por favor. ");
        String edad = JOptionPane.showInputDialog(" Introduce tu edad por favor. ");
        System.out.println("Hola " + nombre + " . Tienes " + edad + " años.");
        //covertimos el String edad a Int edad y lo metemos en variable
        int edadUsuario = Integer.parseInt(edad);
        System.out.println("Hola de nuevo " + nombre + " . El año que viene tendrás " + (edadUsuario+1) + " años.");

    }//fin main
}//fin class
