/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author Daniel
 */
public class Introjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = a / b;
        double resto = a % b;

        System.out.println("La suma de a y b es " + suma);
        System.out.println("La resta de a y b es " + resta);
        System.out.println("La multiplicacion de a y b es " + multiplicacion);
        System.out.println("La division de a y b es " + division);
        System.out.println("El resto de a y b es " + resto);

    }

}
