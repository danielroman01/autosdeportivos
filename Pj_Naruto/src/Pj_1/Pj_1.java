/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pj_1;

/**
 *
 * @author Daniel
 */
public class Pj_1 {
    String nombre;
    String rango;
    double poder;
    
    public static void main(String[] args) {
        Pj_1 naru = new Pj_1();
        
        naru.nombre = "Naruto";
        naru.rango = "Hokage";
        naru.poder = 100000;
        
        System.out.println("Nombre: " + naru.nombre);
        System.out.println("Rango: " + naru.rango);
        System.out.println("Poder: " + naru.poder);
    }
}

