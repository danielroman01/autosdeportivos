/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author Daniel
 */
public class Perro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entidad ent = new Entidad();
        
        ent.setNombre("Touby");
        ent.setEdad(1);
        ent.setRaza("Schnnauzer");
        
        System.out.println("---------------------------");
        System.out.println("Nombre: " + ent.getNombre());
        System.out.println("---------------------------");
        System.out.println("Edad: " + ent.getEdad()+ " año/os");
        System.out.println("---------------------------");
        System.out.println("Raza: " + ent.getRaza());
        System.out.println("---------------------------");
        
        ent.jugar();
        ent.cazar();
    }
    
}
