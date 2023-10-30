/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mario_bross;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Agenda {
    ArrayList<Personaje> pj;
    Scanner sc = new Scanner(System.in);
    
    public Agenda(){
        pj = new ArrayList();
}
    
    public void agregarPersona(int vidas, String personaje){
        Personaje nuevo = new Personaje(vidas, personaje);
        pj.add(nuevo);
    }
    
    public void AlmacenarElemento(int vidas, String personaje){
        System.out.println("Ingresa un pj");
        String nom = sc.nextLine();
        
        
    }
}



