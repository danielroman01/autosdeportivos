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
public class prácticas {

    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

    //    int num1 = 5;
    //    int num2 = 5;
    //    int suma = num1 + num2;
    //    int resta = num1 - num2;
    //    int multiplicacion = num1 * num2;
    //    double division = num1 / num2;
        System.out.println("Ingrese dos números: ");
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
        System.out.println("La división de los dos números es: " + division);
    }
}
