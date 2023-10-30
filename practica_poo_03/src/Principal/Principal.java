/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Principal {
    public static void main(String[] args) {
         Agenda nueva = new Agenda();
         Scanner sc = new Scanner(System.in);
         
         nueva.agregarPersona(1, "Badang");
         nueva.agregarPersona(2, "Changu'e");
         nueva.agregarPersona(3, "Nana");
         
         System.out.println("Ingresa un nombre");
         String nombre = sc.nextLine();
         nueva.agregarPersona(4, nombre);
         
         nueva.eliminarPersona(2);
         nueva.visualizarPersona();
         nueva.buscarPersona(3);
    }

}
