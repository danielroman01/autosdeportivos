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
public class Libro 
{
   
   // atributos
    
    public String ISBM;
    public String titulo;
    public String autor;
    public int NumPaginas;
    
    // Constructores
    
    public Libro(String ISBM, String titulo, String autor, int NumPaginas) {
        this.ISBM = ISBM;
        this.titulo = titulo;
        this.autor = autor;
        this.NumPaginas = NumPaginas;
    }

    public Libro() {
    }
    // Get y Set

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }
    
}

