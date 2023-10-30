/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;





/**
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
public class Ejercicio_8 {
public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    
     System.out.println("Ingrese una nota entre 0 y 10");
    int nota = leer.nextInt();
    String numNota = "";
    
    switch(nota){
        case 1:
            numNota = "";
            break;
        case 2:
        numNota = "";
        break;
        case 3:
            numNota = "";
            break;
        case 4:
            numNota = "";
            break;
            case 5:
            numNota = "";
            break;
        case 6:
        numNota = "";
        break;
        case 7:
            numNota = "";
            break;
        case 8:
            numNota = "";
            break;
             case 9:
            numNota = "";
            break;
        case 10:
            numNota = "";
            break;
        default:
                System.out.println("Debes ingresar una nota entre 0 y 10");
                System.out.println(leer.nextInt());
                
                System.out.println("Debes ingresar una nota entre 0 y 10");
                System.out.println(leer.nextInt());
    }
    
    System.out.println(numNota);
}

}
