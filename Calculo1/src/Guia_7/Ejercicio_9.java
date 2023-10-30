/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse.
 */
public class Ejercicio_9 
{

    public static void main(String[] args) 
    {
        int cont;
        cont = 0;
        boolean x = true;
        int suma;
        suma = 0;
        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese 20 números");
            cont++;
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("¡Se ha capturado el número cero!");
                break;
            }

            if (num < 0) 
            {
                continue;

            }
            suma = suma + num;
        
            if (cont == 20) {
                x = false;
            }
        
    
           } while (x);
        System.out.println("La suma de los números es: " + suma);
        
   }
    
}

