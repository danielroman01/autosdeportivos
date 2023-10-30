/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mario_bross;

/**
 *
 * @author Daniel
 */
public class Personaje {
    String personaje;
    int vidas;
    int codigo;

    Personaje(String personaje, int vidas, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Personaje(int codigo) {
        this.codigo = codigo;
    }

    public Personaje() {
    }

    public Personaje(String personaje, int vidas) {
        this.personaje = personaje;
        this.vidas = vidas;
    }

    Personaje(int vidas, String personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

}
