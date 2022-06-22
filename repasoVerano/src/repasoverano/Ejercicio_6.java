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
//v15 pilInf
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String num1 = JOptionPane.showInputDialog("Introduce un número");
        double num2 = Double.parseDouble(num1);
        System.out.print("La raíz de "+num2 + " es: ");
        System.out.printf("%1.2f",Math.sqrt(num2));

    }//fin main
}//fin class
