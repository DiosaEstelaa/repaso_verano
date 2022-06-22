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
// v11
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "Estela";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        System.out.println("La segunda letra de mi nombre es " + nombre.charAt(1));
        System.out.println("La terfcera letra de mi nombre es " + nombre.charAt(2));
        System.out.println("La cuarta letra de mi nombre es " + nombre.charAt(3));
        System.out.println("La quinta letra de mi nombre es " + nombre.charAt(4));
        System.out.println("La sexta letra de mi nombre es " + nombre.charAt(5));
        
        int ultimaLetra;
        ultimaLetra=nombre.length();
        System.out.println("Y la última letra de " + nombre + " es " + nombre.charAt(ultimaLetra-1));
        

    }//fin main
}//fin class
