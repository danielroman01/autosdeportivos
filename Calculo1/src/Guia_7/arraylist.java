/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class arraylist {

    public static void main(String[] args) {

//        Crear instancia:
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cadena = new ArrayList();

//        Agregar elementos:
        cadena.add("Hello world");
        cadena.add("Súper mario");

//        Recorrer ArrayList con un for:
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println("--->" + cadena.get(i));
        }

//        Eliminar elementos:
        cadena.remove(1);

        System.out.println(" ");
        for (int i = 0; i < cadena.size(); i++) {
            System.out.println("---+" + cadena.get(i));
        }
//        pasar datos por consola: 
        System.out.println("Ingrese una palabra: ");
        String nom = sc.nextLine();
        cadena.add(nom);

//        mostrar elementos de una lista con for: 
        cadena.add("Toby");
        cadena.add("Scott");
        cadena.add("Tiburón");

        for (int i = 0; i < cadena.size(); i++) {
            String s = cadena.get(i);
            System.out.println("Elemento: " + s + " Posición: " + i);
            
        }
    }
}
