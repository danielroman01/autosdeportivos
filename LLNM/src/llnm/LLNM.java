/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llnm;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class LLNM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el IBSM");
        libro1.setISBM(leer.nextLine());
        
        System.out.println("Ingrese el Titulo");
        libro1.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el Autor");
        libro1.setAutor(leer.nextLine());
        
        System.out.println("Ingrese el número de páginas");
        libro1.setNumPaginas(leer.nextInt());
        
        System.out.println("El autor es; "+libro1.getAutor());
        System.out.println("El titulo es; "+libro1.getTitulo());
        System.out.println("El IBSM es; "+libro1.getISBM());
        System.out.println("El número de páginas es; "+libro1.getNumPaginas());
        
    }
    
}
