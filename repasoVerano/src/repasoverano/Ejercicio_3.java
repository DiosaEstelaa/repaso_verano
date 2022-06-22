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
//v12 pilInf
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String alum1, alum2;
        alum1 = "Estela";
        alum2 = "Estela";
        System.out.println("alumno 1 con nombre: " + alum1);
        System.out.println("alumno 2 con nombre: " + alum2);

        System.out.println("El alumno 1 es igual al alumno 2? " + alum1.equals(alum2));
        System.out.println("");
        alum2 = "estela";
        System.out.println("alumno 2 con nombre: " + alum2 + " ( hemos cambiado la 'E' inicial a 'e')");

        System.out.println("El alumno 1 es igual al alumno 2? " + alum1.equals(alum2));
        //sale false porque hemos puesto la primera 'e' en minúsculas. Java diferencia entre mayúsculas y minúsculas

    }//fin main
}//fin class
