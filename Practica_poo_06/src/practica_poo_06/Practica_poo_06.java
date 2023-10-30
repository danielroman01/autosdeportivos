/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo_06;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Practica_poo_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int limite = 0;
        
        System.out.println("Ingresa tu nombre: ");
        String nom = sc.nextLine();
        System.out.println(" ");
        
        while(limite == 0){
           
        System.out.println("!Hola, " + nom + " Bienvenido a el menú!");
        System.out.println("1) Ingrese un jutsu aprendido... ");
        System.out.println(" ");
        System.out.println("1. Ninjutsu");
        System.out.println("------------");
        System.out.println("2. Genjutsu");
        System.out.println("------------");
        System.out.println("3. Taijutsu");
        System.out.println("------------");
        System.out.println(" ");
        System.out.println("4. Ir al menú principal");
        System.out.println("-----------------------");
        System.out.println(" ");
        System.out.println("2) Salir.");
        System.out.println(" ");
        
        System.out.println("Ingrese una opción: ");
        int op = sc.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Ingrese un jutsu: ");
                int Ninjutsu = sc.nextInt();
                if (Ninjutsu == 1) {
                    System.out.println("¡Aprendiste un ninjutsu!");
                    System.out.println(" ");
                } else if (Ninjutsu == 2) {
                    System.out.println("¡Aprendiste un Genjutsu!"); 
                    System.out.println(" ");
                } else if (Ninjutsu == 3) {
                    System.out.println("¡Aprendiste un Taijutsu!");
                    System.out.println(" ");
                } else if (Ninjutsu == 4){  
                    System.out.println(" ");
                    System.out.println("De vuelta al menú principal...");
                    System.out.println(" ");
                        limite = 0;
                }
                break;
            case 2:
                System.out.println("Gracias, hasta pronto.");
                limite = 999;
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
    } // fin while
  }
}
