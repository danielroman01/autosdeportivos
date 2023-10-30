/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_03;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: a) Método
 * constructor con todos los atributos pasados por parámetro. b) Metodo
 * constructor sin los atributos pasados por parámetro. c) Métodos get y set. d)
 * Método para crearOperacion(): que le pide al usuario los dos números y los
 * guarda en los atributos del objeto. e) Método sumar(): calcular la suma de
 * los números y devolver el resultado al main. f) Método restar(): calcular la
 * resta de los números y devolver el resultado al main
 */
public class PooEj_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double n1;
        double n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Ingrese dos números");
        System.out.println("---------------------------------");
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();

        Operaciones aritmetica = new Operaciones(n1, n2);
        System.out.println("---------------------------------");
        System.out.println("La suma es; " + n1 + " + " + n2 + " = " + aritmetica.sumar());
        System.out.println("---------------------------------");

        System.out.println("---------------------------------");
        System.out.println("La resta es;" + n1 + " - " + n2 + " = " + aritmetica.restar());
        System.out.println("---------------------------------");

        if (aritmetica.multiplicacion() == 0) {
            System.out.println("---------------------------------------");
            System.out.println("Error, ha ingresado números no válidos");
            System.out.println("---------------------------------------");

        } else {
            System.out.println("-------------------------------------");
            System.out.println("La multiplicacion es; " + n1 + " * " + n2 + " = " + aritmetica.multiplicacion());
            System.out.println("-------------------------------------");
        }

        if (aritmetica.division() == 0) {
             System.out.println("---------------------------------------");
            System.out.println("Error, ha ingresado números no válidos");
             System.out.println("---------------------------------------");

        } else {

            System.out.println("---------------------------------");
            System.out.println("La division es; " + n1 + " / " + n2 + " = " + aritmetica.division());
            System.out.println("---------------------------------");
        }
    }

}
