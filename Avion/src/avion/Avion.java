/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

import Entidad.Entidad;

/**
 *
 * @author Daniel
 */
public class Avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad ent = new Entidad();
        
        ent.setModelo("Airbus3030");
        ent.setMarca("Iberia");
        ent.setAño(2018);
        
        System.out.println("Modelo: " + ent.getModelo());
        System.out.println("Marca: " + ent.getMarca());
        System.out.println("Año: " + ent.getAño());
        System.out.println("¡Avion creado!");
        
        ent.meterLlave("123456");
        ent.mando("enciende");
      
    }
    
}
