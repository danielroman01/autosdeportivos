/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

/**
 *
 * @author RobertClaros
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
        numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
        Las operaciones asociadas a dicha clase son:
        a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
        b) Agregar los métodos getters y setters correspondientes
        c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
            y se la sumara a saldo actual.
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
            la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
            pondrá el saldo actual en 0.
        f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
            usuario no saque más del 20%.
        g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class Cuenta {
    //Atributos
    private String numeroCuenta;
    private String  DNI;
    private int deposito;
    private int retiro;
    private int saldoActual;
    //Constructores

    public Cuenta(String numeroCuenta, String DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public Cuenta(int deposito, int retiro) {
        this.deposito = deposito;
        this.retiro = retiro;
    }
    
    
    //Getters y Setters

    
    //Metodos

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }
    
    
    //Metodos
    public double deposito(){
        return saldoActual + deposito;
    }
    
    public double retiro(){
        return saldoActual - retiro;
    }
    
    public double retiroRapido(){
        return saldoActual -(saldoActual * 0.2);
    }
}