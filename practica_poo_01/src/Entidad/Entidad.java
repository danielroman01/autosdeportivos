/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Daniel
 */
public class Entidad {

    String artista;
    String musica;
    String genero;
    private boolean acceso = false;

    private void reporducirMusica() {
        System.out.println("¡Reporduciendo!");
    }

    public void meterLlave(String clave, String accion) {
        if (clave.equals("123")) {
            if (accion.equals("lest go")) {
                acceso = true;
                reporducirMusica();
            }
        }
        if (clave != "123" || accion != "lest go") {
            System.out.println("Reproductor de música bloqueado");
        }
       

    }

    public static void main(String[] args) {
        Entidad ent = new Entidad();

        ent.artista = "Basshunter";
        ent.musica = "Now you're gone";
        ent.genero = "Electrónica";

        System.out.println("Artista: " + ent.artista);
        System.out.println("Música: " + ent.musica);
        System.out.println("Género: " + ent.genero);

        ent.meterLlave("123", "lest go");
    }
}
