/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoverano;

/**
 *
 * @author estel
 */
//v15 pilInf
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double num = 10000.0;
        System.out.println("El número de la variable double es " + num);
        //printf("%1.2f"... es para que nos de el resultado con dos decimales
        System.out.println("Al dividirlo entre 3 el resultado con dos decimales es: ");
        System.out.printf("%1.2f", num / 3);
        System.out.println("");
        System.out.println("Al dividirlo entre 3 el resultado con cuatro decimales es: ");
        //printf("%1.4f"... es para que nos de el resultado con cuatro decimales
        System.out.printf("%1.4f", num / 3);
        System.out.println("");

    }//fin main
}//fin class
