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
    String carrera;
    String nivel;
    int tiempo_dedicado;
    private boolean acesso = false;
    

    public Entidad() {
    }

    public Entidad(String carrera, String nivel, int tiempo_dedicado) {
        this.carrera = carrera;
        this.nivel = nivel;
        this.tiempo_dedicado = tiempo_dedicado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getTiempo_dedicado() {
        return tiempo_dedicado;
    }

    public void setTiempo_dedicado(int tiempo_dedicado) {
        this.tiempo_dedicado = tiempo_dedicado;
    }
    
    public void meterLlave(String clave){
        System.out.println("Ingrese la clave... ");
        if (clave.equals("1001823968")) {
            acesso = true;
        }else if (clave!= "1001823968"){
            System.out.println("Acceso denegado");
        }
    }
    
    private void programar(){
        System.out.println("Estas programando");
  
    }
    
    public void saludar(){
        System.out.println("Hola");
    }
}
