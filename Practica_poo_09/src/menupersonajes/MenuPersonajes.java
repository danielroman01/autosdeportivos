/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menupersonajes;

/**
 *
 * @author Daniel
 */
public class MenuPersonajes {

    String id;
    String bando;
    String raza;
    String sexo;
    String clase;
  
    
    public MenuPersonajes(String id, String bando, String raza, String sexo, String clase) {
        this.id = id;
        this.bando = bando;
        this.raza = raza;
        this.sexo = sexo;
        this.clase = clase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBando() {
        return bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

}
