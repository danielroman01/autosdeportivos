/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo_8;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Practica_poo_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int limite = 0;

        while  (limite == 0){
        System.out.println("*****Encuesta*****\n "
                         + " \n"
                         + "1) Medir mi nivel según mi experiencia \n"
                         + "2) Salir. \n"
                         + " \n"
                         + "Ingrese una opción: ");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("¿Que nivel eres? \n"
                        + " \n"
                        + "1. Programador Junior \n"
                        + " \n"
                        + "2. Programador Semi senior\n"
                        + " \n"
                        + "3. Programador Senior\n"
                        + " \n"
                        + "4. ¿Quieres volver?\n");
                int nivel = sc.nextInt();
                if (nivel == 1) {
                    System.out.println("Eres un programador Junior :D \n"
                            + " ");
                }else if (nivel == 2) {
                    System.out.println("¡Genial, eres un programador Semi Senior! \n"
                                     + " ");
                }else if (nivel == 3) {
                    System.out.println("¡Wow, eres un programador Senior! \n"
                                     + " ");
                }else if (nivel == 4) {
                    System.out.println("Volviste al menú principal... \n"
                                     + "-----------------------------"
                                     + " \n");
                    limite = 0;
                }
                break;
            case 2:
                System.out.println("Gracias, hasta pronto.");
                limite = 999;
                break;
            default:
                System.out.println("Opción inválida \n"
                                 + " ");
                limite = 0;
        }//Fin Switch

        }//Fin while
    }

}//Fin clase
