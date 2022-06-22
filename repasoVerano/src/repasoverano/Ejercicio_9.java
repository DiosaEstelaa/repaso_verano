/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoverano;

import java.util.Scanner;

/**
 *
 * @author estel
 */
//v19 pilInf
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //Math.random te da número double, lo que hacemos con '(int)(Math.random()*100)' es convertir el dobule a int
        //al multiplicar el random por 100 ((Math.random()*100)) nos aseguramos que el número sea máximo hasta 100
        int aleatorio = (int) (Math.random() * 100);
        int numero = 0;
        int intentos = 0;
        while (numero != aleatorio) {
            intentos++;//intentos ++ = (intentos = intentos +1)
            System.out.println("Introduce un número por favor: ");
            System.out.println("");
            numero = leer.nextInt();
            if (aleatorio < numero) {
                System.out.println("Más bajo.");
                System.out.println("");
            } else if (aleatorio > numero) {
                System.out.println("Más alto");
                System.out.println("");
            }
        }//fin while
        System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos.");
    }//fin main
}//fin class
