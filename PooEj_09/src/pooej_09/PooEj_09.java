/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_09;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PooEj_09 {

    /**
     * En el main se creará el objeto y se usará el Math.random para generar los
     * dos números y se guardaran en el objeto con su respectivos set. Deberá
     * además implementar los siguientes métodos.
     *
     * @param args
     */
    public static void main(String[] args) {

        Matematica mate = new Matematica();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        mate.setNum1(leer.nextDouble());
        System.out.print("Ingrese el segundo valor: ");
        mate.setNum2(leer.nextDouble());
        mate.devolverMayor();
        mate.calcularPotencia();
//        System.out.println(mate.devolverMayor());
//      System.out.println( (int) (Math.random()*100 + 50));

     
    }

}
