/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

/**
 *
 * @author Daniel
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReemplazarElementosArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Elemento1", "Elemento2", "Elemento3", "Elemento4"));

        // Identificar los índices de los elementos que deseas reemplazar
        int indice1 = 1;
        int indice2 = 3;

        // Crear una nueva lista con los elementos de reemplazo
        List<String> elementosDeReemplazo = Arrays.asList("NuevoElemento1", "NuevoElemento2");

        // Reemplazar los elementos en los índices correspondientes
        for (int i = 0; i < elementosDeReemplazo.size(); i++) {
            lista.set(indice1 + i, elementosDeReemplazo.get(i));
        }

        // Imprimir el ArrayList después del reemplazo
        System.out.println(lista);
    }
}





