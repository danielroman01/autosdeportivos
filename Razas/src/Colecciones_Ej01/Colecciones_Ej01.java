/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones_Ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import razas.Razas;

public class Colecciones_Ej01 {

    private Scanner leer;
    private List<Razas> mascotas;

    public Colecciones_Ej01() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Razas crearMascota() {
        System.out.println("Introduce el nombre de tú mascota: ");
        String nombre = leer.nextLine();

        System.out.println("Introduce su apodo: ");
        String apodo = leer.nextLine();

        System.out.println("Introduce su tipo de raza: ");
        String tipo = leer.nextLine();
        
        Razas m = new Razas(nombre, apodo, tipo);
        mascotas.add(m);
        return m;
   
    }
    

    public void mostrarMascota() {
        System.out.println("Los datos de la lista actúal son: ");
        for (Razas aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cntidad = " + mascotas.size());
    }

    /**
     * Crear mascotas, TODOS chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la
     * lista
     */
    public void fabricaChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
           
            mascotas.add( new Razas("fer", "Chiquito", "Beagle"));
        }
        
    }
    
    /**
     * Crear mascotas pidiendo datos por teclado
     * @param cantidad 
     */
   
    public void fabricaMascota(int cantidad){
    
        for (int i = 0; i < cantidad; i++) {
            Razas  mascotacreada = crearMascota();
            System.out.println(mascotacreada.toString());
        }
    }
    
    
    
    

}
