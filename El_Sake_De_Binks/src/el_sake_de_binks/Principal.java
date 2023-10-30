/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el_sake_de_binks;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        El_Sake_De_Binks sake = new El_Sake_De_Binks();
        
        sake.setCantate("Brooks");
        sake.setMusica("El Sake de biniks");
        sake.setFruta_del_diablo("Revivir");
        
        
        System.out.println("Cantante: " + sake.getCantate());
        System.out.println("Música: " + sake.getMusica());
        System.out.println("Fruta del diablo: " + sake.getFruta_del_diablo());
        
        sake.Cantar();
        sake.bailar();
        
        
        
    }
}
