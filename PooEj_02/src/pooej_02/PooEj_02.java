/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_02;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PooEj_02 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double r;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        r = leer.nextDouble();
        Circunferencia cir01 = new Circunferencia(r);
        
        System.out.println("El area es; "+cir01.area());
        System.out.println("El perimetro es; "+cir01.perimetro());
        
    }
    
}
