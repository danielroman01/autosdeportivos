/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import Colecciones_Ej01.Colecciones_Ej01;



/**
 *
 * @author Daniel
 */
public class Razas {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     * @param args
     */
    public static void main(String[] args) {
        
       Colecciones_Ej01 masc = new Colecciones_Ej01();
       
        masc.fabricaMascota(2);
        masc.mostrarMascota();

    }

    public Razas(String nombre, String apodo, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
