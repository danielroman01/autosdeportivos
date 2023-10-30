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
    String Modelo;
    String procesador;
    double gb;
    double ram;
    private boolean acesso = false;
    public void meterLlave(String clave){
        if (clave.equals("1001823968")) {
            acesso = true;
                    desbloquearSmarphone();
        } if (clave != "1001823968") {
            System.out.println("Smaphone bloqueado");
        }
    }
    
    public void mando(String accion){
        if (accion.equals("Neovi")) {
            acesso = true;
            desbloquearSmarphone();
        } if (accion != "Neovi") {
            System.out.println("Smarphone bloqueado");
        }
    }
    
    private void desbloquearSmarphone(){
        System.out.println("¡Bienvenido! :D");
    }
    
    public void encenderSmarphone(){
        System.out.println("Samsung, ¡Hola!");
    }
    
    public void congurarSmarphone(){
        System.out.println("Configurando...");
    }
    
    public static void main(String[] args) {
        Entidad ent = new Entidad();
        
        ent.marca = "Samsung";
        ent.Modelo = "Galaxy s23 últra";
        ent.procesador = "Snapdragon 8gen2";
        ent.gb = 512;
        ent.ram = 12;
        
        System.out.println("Marca: " + ent.marca);
        System.out.println("Modelo: " + ent.Modelo);
        System.out.println("Procesador: " + ent.procesador);
        System.out.println("Gb de almacenamiento: " + ent.gb);
        System.out.println("Gb de ram: " + ent.ram);
        
        ent.encenderSmarphone();
        ent.meterLlave("1001823968");
        ent.mando("Neovi");
    }  
}
