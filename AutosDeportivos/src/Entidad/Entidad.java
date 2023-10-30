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
    String modelo;
    String marca;
    int año;
    private boolean acesso = false;
    public void meterLlave(String clave){
        if (clave.equals("1001823968")) {
            acesso = true;
        }else {
            System.out.println("Alarma encendida");
        }
    }
    
    public void mando(String accion){
        if (acesso = true) {
            if (accion.equals("enciende")) {
                encenderAuto();
            }
        }if (accion != "enciende") {
            System.out.println("Alarma encendida");
        }
    }

    public Entidad() {
    }

    public Entidad(String modelo, String marca, int año) {
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    private void encenderAuto(){
        System.out.println("¡Lamborghini encendido!");
    }
}
