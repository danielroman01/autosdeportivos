/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej_8;

import Entidad.Cadena;
import java.util.Scanner;

public class PooEj_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena frase = new Cadena();
        System.out.print(" Ingrese una frase: ");
        String line = leer.nextLine();
        int largo = line.length();
        frase.setFrase(line);
        frase.setLongitud(largo);
        frase.mostrarVocales();
        frase.invertirFrase();
        frase.vecesRepetido();
        frase.compararLongitudes();
        frase.unirFrases();
        frase.reemplazar();
        if (frase.contiene()){
            System.out.println("La frase contiene el caracter");
        }else{
            System.out.println(" La frase non contiene el caracter");
        }
    }
}
    






