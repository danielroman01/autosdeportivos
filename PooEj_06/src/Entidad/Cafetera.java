/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Cafetera {
    
    public int tamañoDeTaza;
    public int capacidadMaxima;
    public int cantidadActual;

    public Cafetera(int tamañoDeTaza) {
        this.tamañoDeTaza = tamañoDeTaza;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
        
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getTamañoDeTaza() {
        return tamañoDeTaza;
    }

    public void setTamañoDeTaza(int tamañoDeTaza) {
        this.tamañoDeTaza = tamañoDeTaza;
    }
    
    public int llenarCafetera(){
    
        return cantidadActual = capacidadMaxima;
        
    }
    
    public void servirTaza(int tamañoDeTaza){
    
        if (cantidadActual >= tamañoDeTaza) {
           cantidadActual = cantidadActual - tamañoDeTaza;
        }else {
//            return  0;
        }
     
    }
    
    public int vaciarCafetera(int cantidadActual){
    
        return cantidadActual = 0;
        
    }
    
    public int agregarCafe(int cantidadActual){
    
        return this.cantidadActual + this.cantidadActual;
    }

    public int vaciarCafetera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int agregarCafe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAdicion(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
