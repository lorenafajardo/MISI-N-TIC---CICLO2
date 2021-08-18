/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_employees_g43;

import controller_pkg.Conexion;
import view_pkg.DeparmentsFrame;

/**
 *
 * @author LORENA FAJARDO
 */
public class Practica_employees_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion inst_connect = new Conexion();
        DeparmentsFrame inst_frame = new DeparmentsFrame();
        inst_connect.getConnection();
        inst_frame.setVisible(true);
        
        
    }
    
}
