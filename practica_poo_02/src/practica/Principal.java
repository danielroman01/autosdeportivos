/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Daniel
 */
public class Principal {

    String marca;
    String modelo;
    String placa;
    int cilindraje;
    private boolean acceso = false;
    
    
    // métodos
    public void meterLlave(String llave, String clave){
        if (llave.equals("Introducir llave")) {
            if (clave.equals("1001823968")) {
                acceso = true;
                encenderMoto();
            }
        }
            if (llave != "Introducir llave" || clave != "1001823968") {
                System.out.println("Llamando a la polocia");
            }
        
    }
    private void encenderMoto(){
        System.out.println("¡Runnn...!");
    }

    public static void main(String[] args) {
        Principal nuevo = new Principal();

        nuevo.marca = "Auteco";
        nuevo.modelo = "TVS";
        nuevo.placa = "abc123";
        nuevo.cilindraje = 125;

        System.out.println("Marca: " + nuevo.marca);
        System.out.println("Modelo: " + nuevo.modelo);
        System.out.println("Placa: " + nuevo.placa);
        System.out.println("Cilindraje: " + nuevo.cilindraje);
        
        nuevo.meterLlave("Introducir llave", "1001823968");
    }
}
