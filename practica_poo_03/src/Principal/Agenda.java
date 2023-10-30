/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Agenda {
   private ArrayList<Persona>  personas;
   
   public Agenda(){
    personas = new ArrayList<>();
}
   public void agregarPersona(int codigo, String nombre){
       Persona nuevo = new Persona(codigo, nombre);
        personas.add(nuevo);
   }
   
   public void eliminarPersona(int codigo){
       for (int i = 0; i < personas.size(); i++) {
           if (codigo == personas.get(i).getCodigo()) {
               personas.remove(i);
           }
       }
   }
   
   public void buscarPersona(int codigo){
       for (int i = 0; i < personas.size(); i++) {
           if (codigo == personas.get(i).getCodigo()) {
               System.out.println(personas.get(i).getNombre());
           }
       }
   }
   
   public void visualizarPersona(){
       for (int i = 0; i < personas.size(); i++) {
           System.out.println(personas.get(i).getNombre());
       }
   }
}
 