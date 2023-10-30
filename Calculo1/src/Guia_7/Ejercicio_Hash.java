/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Ejercicio_Hash {
    
     public static void main(String[] args) {
        String[] nombresArray = new String[5];

        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Scott " + (i + 1);
        }

        for (String var : nombresArray) {
            System.out.println(var);
        }

        ArrayList<String> nombresArrayList = new ArrayList();

        nombresArrayList.add("Tiburón");
        nombresArrayList.add("Toby");
        nombresArrayList.add("Scosito");

        System.out.println(nombresArrayList.size()); //3

        nombresArrayList.remove("Tiburón");
        
        System.out.println(nombresArrayList.size()); //2
    }

}
