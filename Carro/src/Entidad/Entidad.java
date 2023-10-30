/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Daniel
 */
public class Entidad {
    
    String modelo;
    String marca;
    String color;

    public Entidad() {
    }

    public Entidad(String modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void encenderCarro(){
        System.out.println("¡El carro está encendido!");
    }
    
    public void acelerar(){
        System.out.println("80km");
    }
    
    public void frenar(){
        System.out.println("0km");
    }
    
    
}
