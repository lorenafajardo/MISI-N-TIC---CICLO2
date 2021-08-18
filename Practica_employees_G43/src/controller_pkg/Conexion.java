/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author LORENA FAJARDO
 */
public class Conexion {
     Connection con;

    public Conexion() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_usuarios_db", "root", "");
            if(con != null){
                System.out.println("Conexión exitosa");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Conexión fallida");
        }
    }
    
    public Connection getConnection(){
        return con;
    } 
    
}
