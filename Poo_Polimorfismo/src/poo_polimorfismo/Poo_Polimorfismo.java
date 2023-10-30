/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorfismo;

import encapsulamiento.Hechicero;
import encapsulamiento.Personaje;

/**
 *
 * @author Daniel
 */
public class Poo_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personaje Hechicero = new Hechicero();

        Hechicero.setNombre("Daniel");
        Hechicero.setEdad(21);
        Hechicero.setTextura("Dani.png");

        System.out.println("--------------------");
        System.out.println("Nombre: " + Hechicero.getNombre());
        System.out.println("--------------------");

        System.out.println("--------------------");
        System.out.println("Edad: " + Hechicero.getEdad());
        System.out.println("--------------------");

        System.out.println("--------------------");
        System.out.println("Textura: " + Hechicero.getTextura());
        System.out.println("--------------------");

        System.out.println("--------------------");
        Hechicero.saludar();
        System.out.println("--------------------");
    }

}
