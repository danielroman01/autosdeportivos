/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import Entidad.Entidad;

/**
 *
 * @author Daniel
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad ent = new Entidad();

        ent.setModelo("Joy");
        ent.setMarca("Chevrolet");
        ent.setColor("Azul");

        System.out.println("Modelo: " + ent.getModelo());
        System.out.println("Marca: " + ent.getMarca());
        System.out.println("Color: " + ent.getColor());
        System.out.println("***************************");
        ent.frenar();
        ent.acelerar();
    }

}
