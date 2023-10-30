/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menupersonajes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.UnaryOperator;

/**
 *
 * @author Daniel
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<MenuPersonajes> personaje = new ArrayList();

        int limite = 0;

        while (limite == 0) {
            System.out.println("-----World of Warcraft----- \n"
                    + " \n"
                    + "1) Crear un nuevo personaje \n"
                    + "2) Modificar personaje \n"
                    + "3) Búscar personaje \n"
                    + "4) Móstrar todos los personajes \n"
                    + "5) Eliminar personaje \n"
                    + "6) Salir. \n"
                    + " \n"
                    + "------------------------------- \n"
                    + " \n"
                    + "  < Ingrese una opción > ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("-----Creando un personaje----- \n"
                            + " \n"
                            + "Ingrese el nombre de usuiario: ");
                    String id = bf.readLine();

                    for (int i = 0; i < personaje.size(); i++) {
                        if (id.equals(personaje.get(i).getId())) {
                            System.out.println("Ese nombre de usuiaro ya existe. \n"
                                    + "Porfavor vuelve a ingresar un nombre de usuario diferente: ");
                            id = bf.readLine();
                        }
                    }

                    System.out.println("Ingrese bando: ");
                    String bando = bf.readLine();

                    System.out.println("Ingrese raza: ");
                    String raza = bf.readLine();

                    System.out.println("Ingrese sexo: ");
                    String sexo = bf.readLine();

                    System.out.println("Ingrese clase: ");
                    String clase = bf.readLine();

                    MenuPersonajes pj_1 = new MenuPersonajes(id, bando, raza, sexo, clase);
                    System.out.println("¡Personaje creado!");
                    personaje.add(pj_1);

                    break;
                case 2:
                    System.out.println("-----Modificando usuario----- \n"
                            + "Ingrese el indice y usuario a modificar: ");
                    int indice = Integer.parseInt(bf.readLine());
                    String ID = bf.readLine();
                    
                    int encontrados = 0;
                    
                    for (int i = 0; i < personaje.size(); i++) {
                        if (indice == i && ID.equals(personaje.get(i).getId())) {
                            
                            System.out.println("Ingrese nuevo usuario: ");
                            ID = bf.readLine();

                            System.out.println("Ingrese nuevo bando: ");
                            String BANDO = bf.readLine();

                            System.out.println("Ingrese nueva raza: ");
                            String RAZA = bf.readLine();

                            System.out.println("Ingrese nuevo sexo: ");
                            String SEXO = bf.readLine();

                            System.out.println("Ingrese nueva clase: ");
                            String CLASE = bf.readLine();
                            encontrados = 1;

                            MenuPersonajes pj_2 = new MenuPersonajes(ID, BANDO, RAZA, SEXO, CLASE);

                            personaje.set(indice, pj_2);
                        }
                    }
                    

                    if (encontrados == 0) {
                        System.out.println("Oh no, personaje no encontrado \n"
                                + " \n");
                    }
                    for (int i = 0; i < personaje.size(); i++) {
                        if (indice != i) {
                            System.out.println("Indice de usuario incorrecto");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Ingrese usuario a buscar: ");
                    String ide = bf.readLine();

                    int encontrado = 0;

                    for (int i = 0; i < personaje.size(); i++) {
                        if (ide.equals(personaje.get(i).getId())) {
                            System.out.println("¡Personaje encontrado! \n"
                                    + "Ubicación del ususario en la lista: " + i);
                            System.out.println("Usuario: " + personaje.get(i).getId());
                            System.out.println("Bando: " + personaje.get(i).getBando());
                            System.out.println("Raza: " + personaje.get(i).getRaza());
                            System.out.println("Sexo: " + personaje.get(i).getSexo());
                            System.out.println("Clase: " + personaje.get(i).getClase() + " \n");
                            encontrado = 1;
                        }
                    }

                    if (encontrado == 0) {
                        System.out.println("Oh no, personaje no encontrado \n"
                                + " \n");
                    }

                    break;
                case 4:
                    System.out.println("Los personajes creados son: \n"
                            + "");
                    for (int i = 0; i < personaje.size(); i++) {
                            System.out.println("Usuario:" + personaje.get(i).getId() + " \n"
                                    + "Bando: " + personaje.get(i).getBando() + " \n"
                                    + "Raza: " + personaje.get(i).getRaza() + " \n"
                                    + "sexo: " + personaje.get(i).getSexo() + " \n"
                                    + "clase: " + personaje.get(i).getClase()+ " \n");
                    }

                    break;
                case 5:
                    System.out.println("Ingrese el usuario del personaje que desea eliminar: ");
                    String Eliminar_Pj = bf.readLine();
                    
                    int Encontrado = 0;

                    for (int i = 0; i < personaje.size(); i++) {
                        if (Eliminar_Pj.equals(personaje.get(i).getId())) {
                            System.out.println("El personaje con el usuario: " + personaje.get(i).getId() + " \n"
                                    + "El bando: " + personaje.get(i).getBando() + " \n"
                                    + "La raza: " + personaje.get(i).getRaza() + " \n"
                                    + "El sexo: " + personaje.get(i).getSexo() + " \n"
                                    + "La clase: " + personaje.get(i).getClase() + " ha sido elminado");
                            personaje.remove(Eliminar_Pj);
                            Encontrado = 1;
                            
                        }

                    }
                    if (Encontrado == 0) {
                        System.out.println("Oh no, personaje no encontrado");
                    }
                    break;
                case 6:
                    System.out.println(" \n "
                            + "Cerrando sección... \n"
                            + " \n"
                            + " Adiós");
                    limite = 999;
                    break;
                default:
                    System.out.println("Opción no válida...");
                    limite = 0;
            }// Fin Switch
        }// Fin While
    }// Fin Main

}// Fin clase
