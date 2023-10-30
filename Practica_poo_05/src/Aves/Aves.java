/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aves;

/**
 *
 * @author Daniel
 */
public class Aves {
    String raza;
    String edad;
    String dia1 = "Lunes";
    int dia2;
    String dia3 = "Lunes";
    String dia4 = "Lunes";
    String dia5 = "Lunes";
    String dia6 = "Lunes";
    String dia7 = "Lunes";

    public String getDia1() {
        return dia1;
    }

    public void setDia1(String dia1) {
        this.dia1 = dia1;
    }

    public int getDia2() {
        return dia2;
    }

    public void setDia2(int dia2) {
        this.dia2 = dia2;
    }

    public String getDia3() {
        return dia3;
    }

    public void setDia3(String dia3) {
        this.dia3 = dia3;
    }

    public String getDia4() {
        return dia4;
    }

    public void setDia4(String dia4) {
        this.dia4 = dia4;
    }

    public String getDia5() {
        return dia5;
    }

    public void setDia5(String dia5) {
        this.dia5 = dia5;
    }

    public String getDia6() {
        return dia6;
    }

    public void setDia6(String dia6) {
        this.dia6 = dia6;
    }

    public String getDia7() {
        return dia7;
    }

    public void setDia7(String dia7) {
        this.dia7 = dia7;
    }
    
    private boolean elevarse = false;

    public Aves() {
    }

    public Aves(String raza, String edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void acceder(String clave){
        if (clave.equals("1001823968")) {
            elevarse = true;
                Volar();
        }else if (clave != "1001823968"){
            System.out.println("Aún no has aprendido a volar");
        }
    }
    
    private void Volar(){
        System.out.println("¡Aprendiste a volar!");
    }
    
    public void Martes(){
        System.out.println("Martes...");
    }
    
}
