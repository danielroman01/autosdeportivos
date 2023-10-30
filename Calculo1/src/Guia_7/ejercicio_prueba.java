/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ejercicio_prueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Hola, " + nombre + " ingrese dos números:");
        int num1 = leer.nextInt(); int num2 = leer.nextInt();
       

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;
        double resto = num1 & num2;

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("La suma de ambos números es: " + suma);
        System.out.println("-------------------------------------------");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("La resta de ambos números es: " + resta);
        System.out.println("-------------------------------------------");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("La múltiplicación de ambos números es: " + multiplicacion);
        System.out.println("-------------------------------------------");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("La división de ambos números es: " + division);
        System.out.println("-------------------------------------------");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.println("El resto de ambos números es: " + resto);
        System.out.println("-------------------------------------------");
        System.out.println(" ");

    }
}
