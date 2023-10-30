/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_7;

import java.util.Scanner;

public class identificar {
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese estatura");
    float estatura = sc.nextFloat();
    
    if (estatura >= 1.70) {
    System.out.println("Eres alto");
    } else {
    System.out.println("Eres bajo");
    }
  }
}
