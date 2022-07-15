/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        int opc;
        while (bandera) {
            System.out.print("Menu de Opciones\n"
                    + "1.-Ingresar Ciudad\n2.-Salir\n");
            opc = entrada.nextInt();
            if (opc == 1) {
                entrada.nextLine();
                Enlace c = new Enlace();
                System.out.println("Ingrese el Nombre de la Ciudad");
                String nom = entrada.nextLine();
                System.out.println("Ingrese la Poblacion");
                int pobla = entrada.nextInt();
                Ciudad ciudad = new Ciudad(nom, pobla);
                c.insertarCiudad(ciudad);
            } else {
                if (opc == 2) {
                    bandera = false;
                } else {
                    System.out.println("Valor fuera del rango");
                }
            }
        }

        
    }
}
