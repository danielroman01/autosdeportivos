/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Daniel
 */
public class Principal {

    public static void main(String[] args) {

        Bebidas bebida1 = new Bebidas("Jugo del valle", "Coca-cola", 1.5);

        System.out.println(" Bebida: " + bebida1.getNombre()
                + " \n "
                + "Marca: " + bebida1.getMarca()
                + " \n "
                + "Litros: " + bebida1.getCapacidad() + "L."
                + " \n ");
    }
}
