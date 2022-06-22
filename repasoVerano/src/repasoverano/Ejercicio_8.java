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
//v18 pilInf
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave="Estela";
        String pass="";
        //mientras la clave no sea igual (false) al pass entonces...
        while(clave.equals(pass)==false){//inicio if 1
            pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor. ");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña inconrrecta.");
            }//fin if 1
        }//fin while
        System.out.println("Contraseña correcta. Acceso permitido. ");
    }//fin main
}//fin class
