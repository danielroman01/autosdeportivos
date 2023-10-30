/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mario_bross;


import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Mario_bross {

    String personaje;
    int vidas;
    private boolean acceso = false;

    // métodos...
    private void iniciarJuego() {
        System.out.println("¡Bienvenido!, cargando datos del juego...");
    }

    public void meterLlave(String contraseña) {
        if (contraseña.equals("1001823968")) {
            acceso = true;
            iniciarJuego();
        } else if (contraseña != "1001923968") {
            System.out.println("Acceso denegado, contraseña invalida");
        }
        
    }
    
//    public void AgregarElementos(String Array[], ArrayList list, Scanner sc){
//        for (int i = 0; i < Array.length; i++) {
//            System.out.println("Ingrese el personaje["+ i +"]");
//            Array[i] = sc.next();
//            list.add(Array[i]);
//        }
//    }


    public static void main(String[] args) {
        Agenda nueva = new Agenda();
        Scanner sc = new Scanner(System.in);
        Mario_bross mario = new Mario_bross();

        mario.personaje = "Maio Bross";
        mario.vidas = 7;

        System.out.println("Personaje: " + mario.personaje);
        System.out.println("Vidas: " + mario.vidas);
        System.out.println(" ");

        int limite = 0;

        while (limite == 0) {

            System.out.println("-----Menú principal-----");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Agregar personaje");
            System.out.println("3. ver cuántas vidas tengo");
            System.out.println("4. cambiar de personaje ");
            System.out.println("5. Salir del juego");
            System.out.println(" ");
            System.out.println("Porfavor ingrese una de las opciones: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la contraseña");
                    String n = sc.nextLine();
                    mario.meterLlave(n);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del personaje: ");
                    String personaje = sc.nextLine();
                    nueva.agregarPersona(0,personaje);
                    
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias, hasta pronto");
                    limite = 999;
                    break;
                default:
            }
//        mario.meterLlave("1001823968");

        }/// Fin while
    }

}
