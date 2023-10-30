/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej_05;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author RobertClaros 5. Realizar una clase llamada Cuenta (bancaria) que debe
 * tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente
 * (entero largo) y el saldo actual (entero). Las operaciones asociadas a dicha
 * clase son: a) Constructor por defecto y constructor con DNI, saldo, número de
 * cuenta e interés. b) Agregar los métodos getters y setters correspondientes
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. d)
 * Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual. e) Método retirar(double retiro): el
 * método recibe una cantidad de dinero a retirar y se la restará al saldo
 * actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
 * saldo actual en 0. f) Método extraccionRapida(): le permitirá sacar solo un
 * 20% de su saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class PooEj_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta001 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        byte opcion = 0;
        
        do {

            System.out.println("-------------------------------");
            System.out.println("Bienvenido al Banco de los Ricos");
            System.out.println("-------------------------------");
            System.out.println("Elija una opcion del Menu");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Realizar deposito a cuenta ");
            System.out.println("3. Realizar retiro  ");
            System.out.println("4. Realizar retiro rapido   ");
            System.out.println("5. Consultar saldo ");
            System.out.println("6. Consultar informacion de la cuenta");
            System.out.println("7. Salir");
            System.out.println("--------------------------------");
            opcion = leer.nextByte();

            switch (opcion) {

                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese el numero de cuenta: ");
                    cuenta001.setNumeroCuenta(leer.next());
                    System.out.print("Ingrese el DNI: ");
                    cuenta001.setDNI(leer.next());
                    System.out.print("Ingrese el saldo actual de la cuenta " + cuenta001.getNumeroCuenta() + " :");
                    cuenta001.setSaldoActual(leer.nextInt());
                    System.out.println("--------------------------------------------");
                    break;

                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("Ingrese el monto que desea depositar: ");
                    cuenta001.setDeposito(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + cuenta001.deposito());
                    cuenta001.setSaldoActual((int) cuenta001.deposito());
                    System.out.println("---------------------------------------------");
                    break;

                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println("Ingrese el monto que desea retirar: ");
                    cuenta001.setRetiro(leer.nextInt());
                    System.out.println("Operacion realizada con exito, su saldo es: " + cuenta001.retiro());
                    cuenta001.setSaldoActual((int) cuenta001.retiro());
                    System.out.println("---------------------------------------------");
                    break;

                case 4:
                    System.out.println("-------------------------------------------");
                    System.out.println("Usted selecciono retiro rapido ");
                    System.out.println("El monto correspondiente al 20% es: " + cuenta001.retiroRapido());
                    cuenta001.setSaldoActual((int) cuenta001.retiroRapido());
                    System.out.println("---------------------------------------------");
                    break;

                case 5:
                    System.out.println("---------------------------------------------");
                    System.out.println("Su saldo actual es: " + cuenta001.getSaldoActual());
                    System.out.println("---------------------------------------------");
                    break;

                case 6:
                    System.out.println("---------------------------------------------");
                    System.out.println("Resumen de la cuenta: ");
                    System.out.println("Numero de cuenta: " + cuenta001.getNumeroCuenta());
                    System.out.println("Numero de DNI: " + cuenta001.getDNI());
                    System.out.println("Saldo actual: " + cuenta001.getSaldoActual());
                    System.out.println("---------------------------------------------");
                    break;
            }
        } while (opcion != 7);
    }

}