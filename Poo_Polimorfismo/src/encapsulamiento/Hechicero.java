/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author Daniel
 */
public class Hechicero extends Personaje {
    
    private int poder;
    
    public void saludar(){
    
        System.out.println("¡Hola!");
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
}
