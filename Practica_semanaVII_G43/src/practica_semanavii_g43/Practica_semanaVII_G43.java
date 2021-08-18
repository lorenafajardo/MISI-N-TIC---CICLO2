/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_semanavii_g43;

import model_pkg.DataModelDB;
import model_pkg.conexion;
import view_pkg.FrameHospital;

/**
 *
 * @author LORENA FAJARDO
 */
public class Practica_semanaVII_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion inst_connect = new conexion();
        DataModelDB inst_data = new DataModelDB();
        FrameHospital inst_frame = new FrameHospital();
        inst_connect.getConnection();
        inst_data.getOwners(1);
        inst_data.getHospital(1);
        inst_frame.setVisible(true);
        

    }

}
