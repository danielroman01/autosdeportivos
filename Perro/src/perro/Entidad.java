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
public class Entidad {
    String nombre;
    String raza;
    int edad;

    public Entidad() {
    }

    public Entidad(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Void jugar(){
        System.out.println("Estás jugando a lanzar la rama");
        return null;
    }
    
    public void cazar(){
        System.out.println("Entraste al modo cazador xdd");
    }
    
    
}
