/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autosdeportivos;

import Entidad.Entidad;

/**
 *
 * @author Daniel
 */
public class AutosDeportivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Entidad ent = new Entidad();
       
       ent.setModelo("Urus");
       ent.setMarca("Lamborghini");
       ent.setAño(2023);
       
        System.out.println("Modelo: " + ent.getModelo());
        System.out.println("Marca: " + ent.getMarca());
        System.out.println("Año: " + ent.getAño());
        System.out.println("¡Auto creado!");
        
        ent.meterLlave("1001823968");
        ent.mando("enciende");
    }
    
}
