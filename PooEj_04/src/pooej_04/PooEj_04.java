/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_04;

import Entidad.Rectángulo;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PooEj_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Rectángulo rec01 = new Rectángulo();
        System.out.print("Ingresa la altura del rectángulo: ");
        rec01.setAltura(leer.nextDouble());

        System.out.print("Ingresa la base: : ");
        rec01.setBase(leer.nextDouble());

        System.out.println("El area del rectángulo es: " + rec01.area());
        System.out.println("El area del perimetro es: " + rec01.perimeto());
        
        for (int i = 0; i < rec01.getAltura(); i++) {
            for (int j = 0; j < rec01.getBase(); j++) {
                System.out.print(" * ");
                
            }
            System.out.println(" ");
        }

    }

}
