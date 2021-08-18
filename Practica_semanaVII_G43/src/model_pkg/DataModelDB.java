/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author LORENA FAJARDO
 */
public class DataModelDB {
    
    public ArrayList<DataDB> getOwners(int idOwner) {
        conexion con = new conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try {
            String sql = "SELECT id, owner FROM tb_pet_owners WHERE 1"; 
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa DataModelDB");
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    list.add(datosDB);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public ArrayList<DataDB> getHospital(int idHospital) {
        conexion con = new conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        DataDB datosDB;
        ArrayList list = new ArrayList();
        try {
            String sql = "SELECT id, name FROM tb_hospital WHERE 1"; 
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa DataModelDB");
                while (rs.next()){
                    datosDB = new DataDB();
                    datosDB.setIdhospital(rs.getInt("id"));
                    datosDB.setHospital(rs.getString("name"));
                    list.add(datosDB);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
}
