/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo_07;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Practica_poo_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limite = 0;

        System.out.println("Ingrese su nombre: ");
        String nom = sc.nextLine();

        while (limite == 0) {

            System.out.println(" ");
            System.out.println("*****"
                    + "¡Hola, " + nom + " Bienvenido al Menú principal!*****");
            System.out.println(" ");
            System.out.println("1) Elegir un auto");
            System.out.println("2) Salir.");
            System.out.println(" ");

            System.out.println("Porfavor ingrese una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Escoga uno de los siguientes autos: ");
                    System.out.println(" ");
                    System.out.println("1. Lamborghini Urus");
                    System.out.println("-------------------");
                    System.out.println(" ");
                    System.out.println("2. Mercedes #i 4");
                    System.out.println("----------------");
                    System.out.println(" ");
                    System.out.println("3. Blazzer rs");
                    System.out.println(" ");
                    System.out.println("----------------");
                    System.out.println(" ");
                    System.out.println("4. ¿Deseas volver al menú principal?");
                    System.out.println(" ");
                    int Elegir_Auto = sc.nextInt();
                    if (Elegir_Auto == 1) {
                        System.out.println("¡Elegiste el Lamborghini Urus!");
                    } else if (Elegir_Auto == 2) {
                        System.out.println("¡Elegiste el Mercedes #i 4!");
                    } else if (Elegir_Auto == 3) {
                        System.out.println("¡Elegiste la Blazzer rs!");
                    } else if (Elegir_Auto == 4) {
                        limite = 0;
                        System.out.println(" ");
                        System.out.println("Volviste al menú principal...");
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Gracias, hasta pronto.");
                    limite = 999;
                    break;
                default:
                    System.out.println("Ingrese una opción válida...");
            }
        }
    }

}
