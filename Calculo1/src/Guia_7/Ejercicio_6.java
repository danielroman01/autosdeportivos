/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25.
 */
public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {

            System.out.println("Ambos números son mayores a 25, el primer número es: " + num1 + " y el segundo es: " + num2);

        } else if (num1 > 25) {

            System.out.println("Únicamente el numero " + num1 + " es mayor a 25");

        } else if (num2 > 25) {
            System.out.println("Únicamente el numero " + num2 + " es mayor a 25");
        }else if (num1 <=25 && num2 <= 25)
            System.out.println("Ningún número es mayor a 25, los números ingresados son: " + num1 + " y " + num2);
    }
}
