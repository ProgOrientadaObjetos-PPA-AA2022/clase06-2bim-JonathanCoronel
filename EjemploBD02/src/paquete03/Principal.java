/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Auto a = new Auto();
        a.establecerPlaca("BCCS0001");
        a.establecerValorMatricula(210.2);
        c.insertarAuto(a);
        
       
    }
}
