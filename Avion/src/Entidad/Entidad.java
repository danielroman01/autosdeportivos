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
    String marca;
    String modelo;
    int año;
    private boolean acceso = false;
    public void meterLlave(String clave){
        if (clave.equals("123456")) {
            acceso = true;
        }else {
            System.out.println("Se activo el modo de seguridad, llamando a la pólicia");
        }
    }
     public void mando(String accion){
         if (acceso == true) {
             if (accion.equals("enciende")) {
                 despegar();
             }
         }
        }

    public Entidad() {
    }

    public Entidad(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    private void despegar(){
        System.out.println("¡Estamos despegando!");
    }
}
