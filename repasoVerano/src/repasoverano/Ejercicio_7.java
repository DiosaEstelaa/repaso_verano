/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoverano;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author estel
 */
//v17 pilInf
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado  \n2: Rectángulo  \n3: Triángulo  \n4: Círculo ");
        int figura = leer.nextInt();
        switch (figura) {
            case 1:
                //para poder usar JOptionPane.showInputDialog tenemos que parsearlo porque los JOptionPane son String
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del rectángulo es " + base*altura);
                break;
            case 3:
                 base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                 altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El área del triángulo es " + (base*altura)/2);
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El área del círculo es ");
                System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
                break;
            default:
                System.out.println("Debes introducir un número entre 1 y 4.");
        }//fin switch
    }//fin main
}//fin class
