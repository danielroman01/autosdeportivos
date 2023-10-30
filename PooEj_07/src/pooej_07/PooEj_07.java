
package PooEj_07;

import Entidad.Persona;
import java.util.Scanner;

public class PooEj_07 {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        persona1.setNombre(leer.nextLine());
        boolean x = false;
        do {
            System.out.print("Ingrese el sexo : 'M' masculino, 'F' femenino, 'O' otro ");

            persona1.comprobarSexo(leer.nextLine().toLowerCase());
        } while (x);
        System.out.print("Ingrese la edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("");
        System.out.print("Ingrese la altura: ");
        persona1.setAltura(leer.nextDouble());
        System.out.print("Ingrese la peso: ");
        persona1.setPeso(leer.nextDouble());

    }

}