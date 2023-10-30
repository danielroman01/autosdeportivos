/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;



/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos:
 */

import java.util.Scanner;

public class Cadena {
    public String frase;
    public int longitud;

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "frase='" + frase + '\'' +
                ", longitud=" + longitud +
                '}';
    }
    //Metodos

    public void mostrarVocales()
    {
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                System.out.print(frase.charAt(i)+" ");
                cont++;
            }

        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }
    public void invertirFrase(){
        for (int i = longitud-1 ; i > 0; i--) {
            System.out.print(frase.charAt(i));

        }
        System.out.println(" ");
    }
    public void vecesRepetido(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un caracter");
        char caracter = leer.next().charAt(0);
        int cont = 0;
        for (int i = 0 ; i < this.longitud; i++){
            if (frase.charAt(i) == caracter) {
               cont++;
            }
        } System.out.println("La frase tiene "+cont+" veces repetido.");
    }
    public void compararLongitudes(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una nueva frase");
        String nuevaFrase = leer.nextLine();
        int longitudnueva = nuevaFrase.length();
        if (longitudnueva == frase.length()) {
            System.out.println("La frase tiene la misma longitud");

        }else{
            System.out.println("La frase no tiene la misma longitud");
        }
    }
    public void unirFrases(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una nueva frase");
        String nuevaFrase = leer.nextLine();
       String total = getFrase() +" "+ nuevaFrase;
        System.out.println(total);
    }
    public void reemplazar(){
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese un caracter para reemplazar las letras a :");
        String nuevoCaracter = leer.nextLine();
        String reemplazo = frase.replace("a", nuevoCaracter);
        System.out.println(reemplazo);
    }
    public boolean contiene(){
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un caracter");
        char caracter = leer.next().charAt(0);
        int cont = 0;
        for (int i = 0 ; i < this.longitud; i++){
            if (frase.charAt(i) == caracter) {
                cont++;
            }
        }
        if (cont == 1) {
            return true;
        }
        return false;
    }
}