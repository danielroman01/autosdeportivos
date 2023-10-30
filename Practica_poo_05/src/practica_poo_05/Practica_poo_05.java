/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo_05;

import Aves.Aves;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Practica_poo_05 {

    public static void main(String[] args) {
        Aves avs = new Aves();
        Scanner sc = new Scanner(System.in);
        
        int limite = 0;
        int op2 = 0;
       
        

//        avs.acceder("1001823968");
//        System.out.println(" ");
//        System.out.println("Ingresa una raza de aves: ");
//        avs.setRaza(sc.nextLine());
//        System.out.println("Raza de aves: " + avs.getRaza());
        
        System.out.println("*****Bienvenid@/s al menú***** ");
        System.out.println("1. Ingresar un dia de la semana");
        System.out.println("2. Salir");
        System.out.println(" ");
        System.out.println("Ingrese una opción: ");
        int op = sc.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Ingrese un dia de la semana: ");
                int Dia_Semana = sc.nextInt();
                if (Dia_Semana == 1) {
                    System.out.println("Lunes...");
                } else if (Dia_Semana == 2) {
                    System.out.println("Martes...");
      
                }
                else if (Dia_Semana == 3) {
                    System.out.println("Miércoles...");
                }
                else if (Dia_Semana == 4) {
                    System.out.println("Jueves...");
                }
                else if (Dia_Semana == 5) {
                    System.out.println("Viernes...");
                }
                else if (Dia_Semana == 6) {
                    System.out.println("Sábado...");
                }else if (Dia_Semana == 7) {
                    System.out.println("Domingo...");
                }
                break;
            case 2:
                System.out.println("Gracias, hasta pronto");
                limite = 999;
                break;
                default:
                System.out.println("Opción inválida");
        }
    }
    
}
