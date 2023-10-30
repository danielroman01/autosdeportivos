/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Colecciones_Razas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        int i = 0;
        do {
     
        System.out.println("-----Bienvenido-----");
        System.out.println("1. Ingresr una raza");
        System.out.println("2. Total de razas ingresadas");
        System.out.println("3. Salir");
        System.out.println(" ");
        System.out.print("Ingrese una opcion porfavor: ");
        i = sc.nextInt();
        
        while (i == 1) {
            System.out.println("Ingresa una raza: ");
            String nom = sc.nextLine();
            razas.add(nom);
           
        }
        if (i == 2) {
            System.out.println("Total de razas ingresadas: ");
        }
        if (i == 3) {
            System.out.println("Saliste");
        }
        if (i != 3) {
            System.out.println("Ingrese una opcion válida porfavor");
        }
         } while (i !=3);
//               do {
//      
//        if (continuar == true) {
//            System.out.println("Ingrese una raza de perro: ");
//            String masc = sc.nextLine();
//            razas.add(masc);
//        }else{
//            System.out.println("Adios");
//        }
//        
//        } while (continuar != true);
    }
}
