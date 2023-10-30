/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set.
 */
public class Matematica {

    double num1;
    double num2;
    double resultado;
    double mayor;
    double menor;
    double[] numeros = {num1, num2};

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Matematica(double resultado) {
        this.resultado = resultado;
    }


    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Matematica() {
    }

//   Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor() {
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else if (num2 > num1) {
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        } else if (num1 == num2) {

            System.out.println("Son iguales los números " + num1 + " y " + num2);
        }

    }
//Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.


public void calcularPotencia(){

    if (num1 > num2) {
        double mayor = num1;
        System.out.println(mayor);
        double menor = num2;
        System.out.println(menor);
 
    }if(num2 > num1) {
        double mayor = num2;
        System.out.println("Número mayor: " + mayor);
        double menor = num1;
        System.out.println("Número menor " + menor);
    }else if(num1 == num2)
        System.out.println("Son iguales");
   
  
  }

}
