/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;

/**
 * Clase Scanner.
 */
public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("-------------------");

        System.out.println("-------------------");
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("-------------------");

    }

}
