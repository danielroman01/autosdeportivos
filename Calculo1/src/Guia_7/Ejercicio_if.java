package Guia_7;


import java.util.Scanner;

/**
 * Establece un algoritmo que solicite la edad del usuario y verifique si es
 * mayor de edad o no, se debe mostrar un mensaje acorde al resultado,ademas si
 * es menor de edad se debe mostrar un mensaje de cuantos años le falta para ser
 * mayor de edad.
 */
public class Ejercicio_if 
{

    public static void main(String args[]) 
    {

        Scanner años = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = años.nextInt();

        if (edad >= 18) 
        {
            System.out.println("¡Eres mayor de edad!");
        } else 
        {
            System.out.println("Eres menor de edad, te faltan " + (18 - edad) + " años para ser mayor de edad");
        }
    }
}
