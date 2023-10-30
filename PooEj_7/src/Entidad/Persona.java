/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * }Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son: Un constructor por defecto. Un constructor con todos los
 * atributos como parámetro. Métodos getters y setters de cada atributo. Metodo
 * crearPersona(): el método crear persona, le pide los valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el
 * objeto Persona. Además, comprueba que el sexo introducido sea correcto, es
 * decir, H, M o O. Si no es correcto se deberá mostrar un mensaje Método
 * calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas
 * 4 personas
 *
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores
 */
public class Persona {

    public String nombre;
    public int edad;
    public String sexo;
    public int peso;
    public int altura;
    public boolean AgregarOtroAtributo;
    public double imc;
    public String Hombre = "H";
    public String Mujer = "M";
    public String Otro = "O";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int isEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isAgregarOtroAtributo() {
        return AgregarOtroAtributo;
    }

    public void setAgregarOtroAtributo(boolean AgregarOtroAtributo) {
        this.AgregarOtroAtributo = AgregarOtroAtributo;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getHombre() {
        return Hombre;
    }

    public void setHombre(String Hombre) {
        this.Hombre = Hombre;
    }

    public String getMujer() {
        return Mujer;
    }

    public void setMujer(String Mujer) {
        this.Mujer = Mujer;
    }

    public String getOtro() {
        return Otro;
    }

    public void setOtro(String Otro) {
        this.Otro = Otro;
    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura, boolean AgregarOtroAtributo, double imc, String Hombre, String Mujer, String Otro) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.AgregarOtroAtributo = AgregarOtroAtributo;
        this.imc = imc;
        this.Hombre = Hombre;
        this.Mujer = Mujer;
        this.Otro = Otro;
    }

    public Persona() {
    }
    
    public String Crearpersona(){
        
        if (sexo != Hombre) {
            System.out.println("Escribe un valor válido");
        }else if (sexo != Mujer) {
        System.out.println("Escribee un valor válido");
        }else if (sexo != Otro){
            System.out.println("Escribe un valor válido");
        }
        
        return nombre + edad + sexo + peso + altura + AgregarOtroAtributo + imc; 
    }
    
    public double Calcularimc(){
     
        double imc = peso / (altura * altura);
        
        return imc;
     }

    
    public int esMayordeEdad(){
       
        
        if (edad >= 18) {
              System.out.println("Eres mayor de edad");
              
        }else if(edad < 18) {
              System.out.println("Eres menor de edad");
         
        }
        return edad;
    }
}