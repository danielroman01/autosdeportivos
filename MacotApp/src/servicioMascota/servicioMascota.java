/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioMascota;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import macotapp.Mascota;

/**
 *
 * @author Daniel
 */
public class servicioMascota {

    private Scanner leer ;

    private List<String> mascotas;
    
    

    public servicioMascota() {
        this. leer = new Scanner(System.in).useDelimiter("/n");
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {

        System.out.print("Introduce el nombre de tù mascota: ");
        String nombre = leer.nextLine();

        System.out.print("Introduce su apodo: ");
        String apodo = leer.nextLine();

        System.out.print("Introduce el tipo de raza: ");
        String tipo = leer.nextLine();
        
        String mascota = "nombre de la mascota: "+ nombre + "," + " apodo:" + " " + apodo + ","+ " tipo de raza:" + " " + tipo; 
        
        mascotas.add(mascota);

    }
    
    public void mostrarmascotas(){
        System.out.println(" ");
        System.out.println("Las mascotas actuales de la lista son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
            
            System.out.println("Cantidad = " + mascotas.size());
        }
        
        
    }
    
    public void eliminarMadcota(int index) {
        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar, El indice es erroneo");
        }
        
        }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i < mascotas.size(); i++) {
           String m = mascotas.get(i);
           
            if (m.getBytes().equals(nombre)) {
                mascotas.remove(i);
            }
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreNuevo, String nombreViejo){
        for (int i = 0; i < mascotas.size(); i++) {
            String m = mascotas.get(i);
            
//            if (m.getNombre().equals(nombreViejo)){
//                m.setNombre();
//            } 
                
            
        }
    }
}

