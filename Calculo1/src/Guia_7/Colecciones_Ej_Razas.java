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
public class Colecciones_Ej_Razas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();

        int opcion;
        boolean salir = false;

        while (salir == false) {
            System.out.println("1. Ingresar una raza de perro \n"
                             + "2. Total de razas Ingresadas \n"
                             + "3. salìr \n"
                             + "Ingrese una de las opciones: ");
            System.out.println("------------------------------");
            opcion = sc.nextInt();
            System.out.println("------------------------------");
        
                if (opcion == 1) {
//                    for (int i = 0; i < razas.size(); i++) {
                    System.out.println("Ingresa una raza: ");
                    String n = sc.next();
                    razas.add(n);
                    
                    System.out.println(opcion);
//                    String s = razas.get(i);
                    }
                
                if (opcion == 2) {
                     System.out.println("El total de las razas ingresadas es/son: ");
                     
                }
                   
                if (opcion == 3) {
                     System.out.println("¡Gracias, hasta pronto!");
                      salir = true;
                }
                   
                
                if (opcion != 3) {
                     System.out.println("Porfavor ingrese una opciòn vàlida");
                   
                }
                   
            }
        }
    }

