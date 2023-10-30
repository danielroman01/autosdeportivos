/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_08;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PooEj_08 {

    public int conteoLegtras(String frase) {
        int numeroLetras = 0;
        
        for (int i = 0; i< frase.length(); i++) {
            if (frase.charAt(i)!=' ') {
                numeroLetras++;
            }
        }
        
        return numeroLetras;
    }
    
    Sacanner Lector = new Scanner(System.in);
    
    public static void main(String[] args) {
       
//        Scanner cade = new Scanner(System.in);
//        String frase;
//        
//        System.out.println("Ingrese una frase");
//        frase = cade.nextLine();
//        System.out.println("La frase es: "+ frase +" y su longitud es: "+ frase.length());
//        
    }

    
}
